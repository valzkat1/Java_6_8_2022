<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<jsp:include page="cabecera.jsp"/>
<link href="/css/autocompleteBS.css" rel="stylesheet" />


<div class="container">
 
 <h3>Editar Incapacidad</h3>
 <form:form modelAttribute="ausentismo" method="POST" action="/form_incapacidad">
 
 <div class="row">
 
 <div class="col">
 
  <div class="mb-3 autocompleteBS">
          <label for="inputText1" class="form-label">Buscar Empleado</label>
          <form:input type="text" class="form-control" id="nombreEmpleado" path="nombre" />
          <form:errors path="nombre"></form:errors>
        </div>
       
    
          <div class="mb-3">
            <label for="inputID1" class="form-label">ID Usuario</label>
            <form:input type="text" class="form-control" id="dataEmpleado"  path="numDoc" />
          </div>
 

  <div class="mb-3 autocompleteBS">
          <label for="nombreDiagnosti" class="form-label">Buscar Diagnostico</label>
          <input type="text" class="form-control" id="nombreDiagnosti" name="nombreDiagnosti" value="${ausentismo.getDiagnostico().getDiagnostico() }">
        </div>
       
    
          <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Codigo CIE10</label>
            <input type="text" class="form-control" id="dataDiagnosti" name="dataDiagnosti" value="${ausentismo.getDiagnostico().getCodigo() }">
          </div>     

  <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Tipo Incapacidad</label>
           <form:select path="tipoIncapacidad" class="form-select">
             <form:option value="">- Seleccionar -</form:option>
             <form:option value="Enfermedad Comun">Enfermedad Comun</form:option>
             <form:option value="Licencia Maternidad">Licencia Maternidad</form:option>
             <form:option value="Licencia Paternidad">Licencia Paternidad</form:option>
              <form:option value="Accidente de trabajo">Accidente de trabajo</form:option>
              <form:option value="Enfermedad laboral">Enfermedad Laboral</form:option>
              <form:option value="Fondo Pensiones">Fondo Pensiones</form:option>
              <form:option value="Accidente de transito">Accidente de transito</form:option>
           </form:select>
           <form:errors path="tipoIncapacidad"></form:errors>
          </div> 

 <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Cargo</label>
            <form:input type="text" class="form-control" id="cargo" path="cargo" />
            <form:errors path="cargo"></form:errors>
          </div> 
          
      <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">EPS</label>
            <form:input type="text" class="form-control" id="eps" path="EPS"  />
            <form:errors path="EPS"></form:errors>
          </div> 
    
    </div>
    
     <div class="col">     
          
   <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Salario</label>
            <form:input type="text" class="form-control" id="salario"  path="salario" onblur="calcularSalario()"/>
            <form:errors path="salario"></form:errors>
          </div>              

 
 
  <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Salario x Dia</label>
            <form:input type="text" class="form-control" id="salarioDia"  path="salarioDia"  />
            <form:errors path="salarioDia"></form:errors>
          </div> 
 
 
 
   <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Fecha Inicio</label>
            <form:input type="date" class="form-control" id="fechaInicio"  path="fechaInicio" />
            <form:errors path="fechaInicio"></form:errors>
          </div> 
          
     <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Fecha Fin</label>
            <form:input type="date" class="form-control" id="fechaFin"  path="fechaFin" onchange="calcularDias()" onblur="calcularDias()"/>
            <form:errors path="fechaFin"></form:errors>
          </div> 
          
          
      <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Total Dias</label>
            <form:input type="text" class="form-control" id="totalDias"  path="totalDias" />
            <form:errors path="totalDias"></form:errors>
          </div> 
          
          
          
       <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Clasificación</label>
            <form:select path="clasificacion" class="form-select">
               <form:option value="">- Seleccionar -</form:option>
           		<form:option value="Inicial">Inicial</form:option>
            <form:option value="Prorroga">Prorroga</form:option>
            
            </form:select>
        
            <form:errors path="clasificacion"></form:errors>
          </div>                   
          
  <form:hidden path="id"/>
 <form:button type="submit" class="btn btn-primary">Enviar</form:button>
 
 
 </div>
 </div>
 
 </form:form>


</div>



<jsp:include page="pie.jsp"/>

<script src="/js/autocompleteBS.js"></script> 


<script>
function calcularDias(){
	
	console.log("Llamando calculo dias..");
	
	var fechaIni= document.getElementById("fechaInicio").value;
	var fechaFin= document.getElementById("fechaFin").value;
	
	console.log("fechas: "+fechaIni+"   "+fechaFin);
	
	var fecha1= Date.parse(fechaIni);
	var fecha2= Date.parse(fechaFin);
	
	console.log("fechas Milisegundos: "+fecha1+"   "+fecha2);
	
	
	
	
	var diferencia=fecha2-fecha1;
	
	console.log("Diferencia: "+diferencia);
	
	//var totalDias=(diferencia/1000)/60/60/24;
	var totalDias=(diferencia/(3600*1000*24));
	
	document.getElementById("totalDias").value=totalDias;
	
}


function calcularSalario(){
	var totalDia= (document.getElementById("salario").value)/30;
	
	document.getElementById("salarioDia").value=totalDia;
}


const autoCompleteConfig = [{
    name: 'Empleados',
    debounceMS: 250,
    minLength: 3,
    maxResults: 20,
    inputSource: document.getElementById('nombreEmpleado'),
    targetID: document.getElementById('dataEmpleado'),
    fetchURL: 'http://localhost:8087/api/empleados?text={term}',
    fetchMap: {id: "id_user",
               name: "nombre"}
  },
  {
	    name: 'Diagnosticos',
	    debounceMS: 250,
	    minLength: 3,
	    maxResults: 20,
	    inputSource: document.getElementById('nombreDiagnosti'),
	    targetID: document.getElementById('dataDiagnosti'),
	    fetchURL: 'http://localhost:8087/api/diagnosticos?text={term}',
	    fetchMap: {id: "codigo",
	               name: "diagnostico"}
	  }
];

//console.log(autoCompleteConfig);

// Initiate Autocomplete to Create Listeners
autocompleteBS(autoCompleteConfig);

function resultHandlerBS(inputName, selectedData) {
  console.log(inputName);
  console.log(selectedData);
}

</script>
