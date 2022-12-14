



function enviarDatosUsuario(){
var nombreabuelo = "Juan"
var nombreabuela = "María"
 var btn_pagar=document.getElementById("btn_pagar");
        var nombres=document.getElementById("nombres");
        var telefono=document.getElementById("telefono");
        var pais=document.getElementById("pais");
        var email=document.getElementById("email");
        var mensaje=document.getElementById("mensaje");

     var btn_enviar=document.getElementById("btn_enviar");
     btn_enviar.text="Gracias!"
     var info="*Nombre aspirante:* "+nombres.value+" *Teléfono:* "+telefono.value+" *País:* "+pais.value+" *E-Mail:* "+email.value+" *Mensaje:* "+mensaje.value+""

     btn_enviar.href = "https://wa.me/+16098752052?text="+info+"";
   }