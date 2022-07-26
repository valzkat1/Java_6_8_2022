<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<jsp:include page="cabecera.jsp"/>


<div class="container">
 
 <h3>${titulo }</h3>
 <form:form modelAttribute="usuario" method="POST" action="/editar_user">
 
 
    <label class="form-label" >Nombre Usuario</label>
 <form:input type="text"  class="form-control form-control-lg" path="username"
              placeholder="Nombre" />         
            <form:errors path="username" class="errores"></form:errors>
 <br/>
 
    
 

     <label class="form-label" >Roles</label>
 <form:select class="form-select" path="roles">
   <form:option value="Consultas">Consultas</form:option>
   <form:option value="Auxiliar">Auxiliar</form:option>
   <form:option value="Admin">Admin</form:option>
 </form:select>         
            <form:errors path="roles" class="errores"></form:errors>
 
 <br/>

<form:hidden path="unoAuno" value=""/>
  <c:if test = "${editando}">
        
<form:hidden path="id" value=""/>
      </c:if>

 
 <form:button type="submit" class="btn btn-primary">Enviar</form:button>
 
 
 </form:form>


</div>



<jsp:include page="pie.jsp"/>