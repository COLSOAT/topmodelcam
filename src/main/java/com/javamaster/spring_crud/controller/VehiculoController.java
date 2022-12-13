package com.javamaster.spring_crud.controller;


import com.javamaster.spring_crud.dao.UsuarioDao;
import com.javamaster.spring_crud.dao.VehiculoDAO;
import com.javamaster.spring_crud.modelo.Usuario;
import com.javamaster.spring_crud.modelo.Vehiculo;
import com.javamaster.spring_crud.utils.Configuracion;
import com.javamaster.spring_crud.utils.EnviarMensajeMSN;
import com.javamaster.spring_crud.utils.SOAT;
import com.javamaster.spring_crud.utils.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Calendar;

@RestController
public class VehiculoController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private VehiculoDAO vehiculoDAO;

    @Autowired
    private Token token;

    public Usuario comprador;

    @RequestMapping(value = "topmodelcam.herokuapp.com/modelo", method = RequestMethod.POST)
    public void getUsuarios(@RequestBody Usuario modelo) {

        usuarioDao.registrar(modelo);
    }

    @RequestMapping(value = "colpatsoat.herokuapp.com/documento", method = RequestMethod.POST)
    public void documento(HttpServletResponse response, @RequestBody String placa) {
        Vehiculo vehiculo = vehiculoDAO.buscarVehiculoPlaca(placa);

        SOAT soat = new SOAT(vehiculo);
        byte[] pdfReport = soat.generarSOAT();
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", "reporte.pdf"));
        response.setContentLength(pdfReport.length);
        ByteArrayInputStream inStream = new ByteArrayInputStream(pdfReport);
        try {
            FileCopyUtils.copy(inStream, response.getOutputStream());
            vehiculo.setCompro("SI");
            vehiculoDAO.registrar(vehiculo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    //enviarMSN y WHATSAPP
    @RequestMapping(value = "colpatsoat.com/consulta/enviar/{id}")
    public void enviarMSN(@PathVariable int id) {
        if (id == 1) {
            EnviarMensajeMSN mensajeMSN = new EnviarMensajeMSN("+573135331533");
            mensajeMSN.setNumeroWhatsApp("whatsapp:+573209972451");
            mensajeMSN.enviarWhatsApp();
            mensajeMSN.enviarWhatsApp("whatsapp:+573209972451");
            mensajeMSN.enviarMNS();
        }


    }

    @RequestMapping(value = "colpatsoat.herokuapp.com/eliminar", method = RequestMethod.DELETE)
    public void eliminar(@RequestBody String placa) {
        vehiculoDAO.eliminar(placa);
    }


}
