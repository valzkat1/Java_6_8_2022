<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<jsp:include page="cabecera.jsp"/>


<div class="container">
 
 <h3>Crear Empleados</h3>
 <form:form modelAttribute="empleado" method="POST" action="/form_empleado">
 
 
    <label class="form-label" >Nombre</label>
 <form:input type="text"  class="form-control form-control-lg" path="nombre"
              placeholder="Nombre" />         
            <form:errors path="nombre"></form:errors>
 
 
     <label class="form-label" >Apellidos</label>
 <form:input type="text"  class="form-control form-control-lg" path="nombre"
              placeholder="Nombre" />         
            <form:errors path="nombre"></form:errors>
 
 

 
  <label class="form-label" >Tipo ID</label>
 <form:select path="tipoID" class="form-select" >
   <form:options  itemLabel="nombre" items="${listaTipoID}" itemValue="valor" />
 
 </form:select>
 
 
      <label class="form-label" >ID</label>
 <form:input type="text"  class="form-control form-control-lg" path="id_user"
              placeholder="Identificacion de Usuario(CC)" />         
            <form:errors path="id_user"></form:errors>
 
 
    <label class="form-label" >Salario</label>
 <form:input type="text"  class="form-control form-control-lg" path="salario"
              />         
            <form:errors path="salario"></form:errors>
            
            
            
       <label class="form-label" >Cargo</label>
 <form:input type="text"  class="form-control form-control-lg" path="cargo"
              placeholder="Cargo" />         
            <form:errors path="cargo"></form:errors>        
 
 
 
 <form:button type="submit" class="btn btn-primary">Enviar</form:button>
 
 
 </form:form>


</div>



<jsp:include page="pie.jsp"/>