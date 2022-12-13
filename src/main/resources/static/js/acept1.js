
 var btn_pagar=document.getElementById("btn_pagar");
    var cuadricula= document.getElementById('cuadricula');
btn_pagar.style.display = "none";
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
    var lb_titulo_no_placa=document.getElementById("lb_no_placar");
    var lb_nombre_comprador=document.getElementById("lb_nombre_comprador");
    var lb_no_placa=document.getElementById("lb_no_placa");
    var lb_marca=document.getElementById("lb_marca");
    var lb_modelo=document.getElementById("lb_modelo");
    var lb_linea=document.getElementById("lb_linea");
    var lb_cIlindraje=document.getElementById("lb_cIlindraje");
    var lb_numeroChasis=document.getElementById("lb_numeroChasis");
    var lb_no_motor=document.getElementById("lb_no_motor");



       btn_pagar.style.display = "block";
lb_titulo_no_placa.style.display = "block";
lb_titulo_no_placa.textContent="$870.000";

    }
    catch (Exception){

               btn_pagar.style.display = "none";
           alert("RUT DICE: No fue posible encontrar un registro.");
    }
   }









