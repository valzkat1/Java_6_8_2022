<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="/calculo2" method="POST">
<h3>Promedio de ${estudiante}</h3>

  <c:forEach var = "i" begin = "1" end = "${cantidad}">
     <p>   Nota  <c:out value = "${i}"/> <input type="number" name="notas"/></p>
      </c:forEach>

<p>
<button type="submit">Calcular</button>
</p>

</form>
</body>
</html>