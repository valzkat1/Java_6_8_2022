<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
    <jsp:include page="cabecera.jsp" />  
 


<h2>Crear Usuario</h2>

<form:form modelAttribute="usuario" method="POST" action="/formuluario">

<label>Nombre:</label>
<form:input path="nombre" type="text"  class="form-control"/>
<form:errors path="nombre"></form:errors>


<label>Email:</label>
<form:input path="email" type="text"  class="form-control"/>
<form:errors path="email"></form:errors>


<label>Edad:</label>
<form:input path="edad" type="text"  class="form-control"/>
<form:errors path="edad"></form:errors>

<label>Clave:</label>
<form:input path="clave" type="text"  class="form-control"/>
<form:errors path="clave"></form:errors>


<label>Identificacion:</label>
<form:input path="id" type="number"  class="form-control"/>
<form:errors path="id"></form:errors>

<hr/>
<button value="Guardar" class="btn btn-primary">Guardar</button>


</form:form>


</div>


 <jsp:include page="pie.jsp" />
