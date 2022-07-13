<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<jsp:include page="cabecera.jsp"/>
<link href="/css/autocompleteBS.css" rel="stylesheet" />


<div class="container">
 
 <h3>Registrar Incapacidad</h3>
 <form:form modelAttribute="ausentismo" method="POST" action="/form_incapacidad">
 
 
  <div class="mb-3 autocompleteBS">
          <label for="inputText1" class="form-label">Buscar Empleado</label>
          <input type="text" class="form-control" id="nombreEmpleado">
        </div>
       
    
          <div class="mb-3">
            <label for="inputID1" class="form-label">ID Usuario</label>
            <input type="text" class="form-control" id="dataEmpleado" disabled>
          </div>
 

  <div class="mb-3 autocompleteBS">
          <label for="nombreDiagnosti" class="form-label">Buscar Diagnostico</label>
          <input type="text" class="form-control" id="nombreDiagnosti">
        </div>
       
    
          <div class="mb-3">
            <label for="dataDiagnosti" class="form-label">Codigo CIE10</label>
            <input type="text" class="form-control" id="dataDiagnosti" disabled>
          </div>     

 


 
 <form:button type="submit" class="btn btn-primary">Enviar</form:button>
 
 
 </form:form>


</div>



<jsp:include page="pie.jsp"/>

<script src="/js/autocompleteBS.js"></script> 


<script>
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
