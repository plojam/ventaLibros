
function cargarIndex(){
	
	console.log("Stamos Aqui");
	
	location.href ="/VentaDeLibros/inicioBiblio";
}

comFisico="";
comDigi="";

function recogerDatFis(nodo){
	var nodoTd = nodo.parentNode; //Nodo TD

    var nodoTr = nodoTd.parentNode; //Nodo TR

    var nodosEnTr = nodoTr.getElementsByTagName('td');

    var id = nodosEnTr[0].textContent; 
    
    var cantidad = nodosEnTr[5].getElementsByTagName('input').item(0).value;
    
    comFisico=comFisico+";"+id+","+cantidad;
    
    console.log(comFisico);
}

function recogerDatDigi(nodo){
	var nodoTd = nodo.parentNode; //Nodo TD

    var nodoTr = nodoTd.parentNode; //Nodo TR

    var nodosEnTr = nodoTr.getElementsByTagName('td');

    var id = nodosEnTr[0].textContent; 
    
    var cantidad = nodosEnTr[5].getElementsByTagName('input').item(0).value;
    
    comDigi=comDigi+";"+id+","+cantidad;
    
    console.log(comDigi);
}


function confirmar() {
		var cedula=document.getElementById("cedula").value;
        if (window.XMLHttpRequest) {
            // code for IE7+, Firefox, Chrome, Opera, Safari 
            xmlhttp = new XMLHttpRequest();
        } else { // code for IE6, IE5 
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                //alert("llegue");
                document.getElementById("pantalla").innerHTML = this.responseText;
            }
        };

        xmlhttp.open("GET", "/VentaDeLibros/CrearCompra?op=2&comFisico="+comFisico+"&comDigi="+comDigi+"&cedula="+cedula, true);
        xmlhttp.send();
	
	lisPedido="";
    return false;
    
}


