 var btn_enviar=document.getElementById("btn_enviar");



async function enviarDatosUsuario(){
    try {
        var btn_pagar=document.getElementById("btn_pagar");
        var nombres=document.getElementById("nombres");
        var telefono=document.getElementById("telefono");
        var pais=document.getElementById("pais");
        var email=document.getElementById("email");
        var mensaje=document.getElementById("mensaje");

        let dato={};
        dato.nombres=document.getElementById("nombres").value;
        dato.telefono=document.getElementById("telefono").value;
        dato.pais=document.getElementById("pais").value;
        dato.email=document.getElementById("email").value;
        dato.mensaje=document.getElementById("mensaje").value;
        dato.identificacion="0";
        console.log(dato);
    const request = await fetch('topmodelcam.herokuapp.com/modelo', {
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
        alert("Servidor dice: No fue posible conectar");
}



    }
    catch (Exception){
        alert("Servidor dice: No fue posible conectar");

    }
   }