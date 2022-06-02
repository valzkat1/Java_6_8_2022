<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fomularios MVC Spring</title>
</head>
<body>

<f:form  action="/usuarios/crearMVC" method="POST" modelAttribute="estudiante" >

<p>
Nombre: <f:input type="text"  path="nombre" name="nombre"/>

</p>
<p>
Edad: <f:input type="text" path="edad" name="edad" />

</p>

<p>
Apellidos: <f:input type="text" path="apellidos" name="apellidos"/>

</p>
Direccion: <f:input type="text" path="direccion" name="direccion"/>

<p>
Telefono: <f:input type="text" path="telefono" name="telefono"/>

</p>

<p>
Genero: <f:select path="genero">
<f:option value="">-- Seleccione --</f:option>
<f:option value="M">Masculino</f:option>
<f:option value="F">Femenino</f:option>
<f:option value="O">Otros</f:option>
</f:select>

</p>

<p>
Activo: <f:checkbox path="activo" value="true"/>

</p>
<p>
Mayor de edad: <f:radiobutton path="mayorEdad" value="true"/>

</p>


<p>
Clave: <f:password path="clave"/>


</p>

<p>
Perfil: <f:textarea path="textoLargo"  cols="30"  rows="6"/>


</p>


<p>
Escondido: <f:hidden path="escondido" value="Informacion escondida"/>
</p>

<p>
<f:button type="submit">Enviar</f:button>
</p>

</f:form>


</body>
</html>