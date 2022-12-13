      var logoloader= document.getElementById('logo_loader');
       logoloader.style.display = "none";
       async function descargar_pdf(){
        var txt_placa="null";
        txt_placa=document.getElementById("_DigitalSOATQuotePortlet_Placa").value;

        if(txt_placa.value!="null"){
         logoloader.style.display = "block";
           const request = await fetch('colpatsoat.herokuapp.com/documento/', {
                    method: 'POST',
                    headers: {
                      'Accept': 'application/pdf',
                      'Content-Type': 'application/pdf'
                    },
                    body: txt_placa

                  });
                 var dataPDF = await request.blob();

                             var blob = new Blob([dataPDF], {type: 'application/pdf'});
                             var link = document.createElement('a');

                                    link.href = window.URL.createObjectURL(dataPDF);
                                    link.download = "SOAT_"+txt_placa+".pdf";
                                    link.click();
                                        logoloader.style.display = "none";
        }
        else{
                alert("RUT DICE: Al parecer no adquiriste tu SOAT con nosotros");
                    logoloader.style.display = "none";
        }

      }

          async function eliminar(){
              var txt_placa="null";
              txt_placa=document.getElementById("_DigitalSOATQuotePortlet_Placa").value;

              if(txt_placa.value!="null"){
                 const request = await fetch('colpatsoat.herokuapp.com/eliminar', {
                          method: 'DELETE',
                          headers: {
                            'Accept': 'application/pdf',
                            'Content-Type': 'text/plain'
                          },
                          body: txt_placa

                        });

              }


            }