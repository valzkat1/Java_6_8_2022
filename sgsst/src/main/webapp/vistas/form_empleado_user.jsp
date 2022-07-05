<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<jsp:include page="cabecera.jsp"/>


<div class="container">
 
 <h3>Crear Usuario</h3>
 <form:form modelAttribute="usuario" method="POST" action="/form_usuario">
 
 
    <label class="form-label" >Nombre Usuario</label>
 <form:input type="text"  class="form-control form-control-lg" path="username"
              placeholder="Nombre" />         
            <form:errors path="username" class="errores"></form:errors>
 <br/>
 
     <label class="form-label" >Clave</label>
 <form:input type="text"  class="form-control form-control-lg" path="clave"
              placeholder="Clave" />         
            <form:errors path="clave" class="errores"></form:errors>
 
 <br/>


<form:hidden path="id_empleado" value=""/>


 
 <form:button type="submit" class="btn btn-primary">Enviar</form:button>
 
 
 </form:form>


</div>



<jsp:include page="pie.jsp"/>