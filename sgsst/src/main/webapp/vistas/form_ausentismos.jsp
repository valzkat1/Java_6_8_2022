<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<jsp:include page="cabecera.jsp"/>


<div class="container">
 
 <h3>Registrar Incapacidad</h3>
 <form:form modelAttribute="ausentismo" method="POST" action="/form_incapacidad">
 
   <label class="form-label" >Empleado</label>
 <input type="text"  class="form-control form-control-lg" id="nombreEmpleado"
              />         
           
 <input type="hidden" id="dataEmpleado"/>
 <br/>
       

 


 
 <form:button type="submit" class="btn btn-primary">Enviar</form:button>
 
 
 </form:form>


</div>



<jsp:include page="pie.jsp"/>

<script src="https://oportuna.red/apks/autocompleteBS.js"></script> 


<script>
const autoCompleteConfig = [{
    name: 'Empleados',
    debounceMS: 250,
    minLength: 3,
    maxResults: 10,
    inputSource: document.getElementById('nombreEmpleado'),
    targetID: document.getElementById('dataEmpleado'),
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
