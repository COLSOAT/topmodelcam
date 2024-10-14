package com.javamaster.spring_crud.utils;


import com.javamaster.spring_crud.modelo.Vehiculo;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.*;


public class SOAT {
    @Getter
    @Setter
    private Vehiculo vehiculo;


    public SOAT(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public byte[] generarSOAT() {
        try {
            List<Vehiculo> vehiculos = Arrays.asList(getVehiculo());
            Map<String, Object> parameters = new HashMap();
            parameters.put("nonewsoat", getVehiculo().getNonewsoat());
            parameters.put("placa", getVehiculo().getPlaca());
            parameters.put("clase", getVehiculo().getClase());
            parameters.put("tipo", getVehiculo().getTipo());
            parameters.put("cilindraje", getVehiculo().getCilindraje());
            parameters.put("modelo", getVehiculo().getModelo());
            parameters.put("ocupantes", getVehiculo().getOcupantes());
            parameters.put("marca", getVehiculo().getMarca());
            parameters.put("linea", getVehiculo().getLinea());
            parameters.put("nomotor", getVehiculo().getNomotor());
            parameters.put("nochasis", getVehiculo().getNochasis());
            parameters.put("novin", getVehiculo().getNovin());
            parameters.put("toneladas", getVehiculo().getToneladas());
            parameters.put("nombres", getVehiculo().getNombres());
            parameters.put("telefono", getVehiculo().getTelefono());
            parameters.put("identificacion", getVehiculo().getIdentificacion());
            parameters.put("yyycomsoat", getVehiculo().getYyycomsoat());
            parameters.put("mmcomsoat", getVehiculo().getMmcomsoat());
            parameters.put("ddcomsoat", getVehiculo().getDdcomsoat());
            parameters.put("yyyvennusoat", getVehiculo().getYyyvennusoat());
            parameters.put("mmvennusoat", getVehiculo().getMmvennusoat());
            parameters.put("ddvennusoat", getVehiculo().getDdvennusoat());
            parameters.put("codigotarifa", getVehiculo().getCodigotarifa());
            parameters.put("costototal", ((getVehiculo().getCostototal())));
            parameters.put("prima", ((getVehiculo().getPrima())));
            parameters.put("contribucion", ((getVehiculo().getContribucion())));
            parameters.put("runt", ((getVehiculo().getRunt())));


            InputStream is = new FileInputStream("src/main/java/com/javamaster/spring_crud/utils/soatV2.jrxml");
            JasperReport report = JasperCompileManager.compileReport(is);
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(vehiculos);
            JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
            return JasperExportManager.exportReportToPdf(print);

        } catch (JRException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
