<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar sesion</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<style type="text/css">
body{background: #000}.card{border: none;height: 320px}.forms-inputs{position: relative}.forms-inputs span{position: absolute;top:-18px;left: 10px;background-color: #fff;padding: 5px 10px;font-size: 15px}.forms-inputs input{height: 50px;border: 2px solid #eee}.forms-inputs input:focus{box-shadow: none;outline: none;border: 2px solid #000}.btn{height: 50px}.success-data{display: flex;flex-direction: column}.bxs-badge-check{font-size: 90px}


</style>
</head>
<body>

<div class="container">
<h2>Iniciar Sesion</h2>

<!--<form:form modelAttribute="usuario" method="POST" action="/login">

<labe>Nombre Usuario:</labe>
<form:input path="nombre" class="form-control"/>

<labe>Clave:</labe>
<form:input path="clave" class="form-control"/>

<button type="submit" class="btn btn-primary">Enviar</button>

</form:form>-->


<div class="container mt-5">
    <div class="row d-flex justify-content-center">
        <div class="col-md-6">
            <div class="card px-5 py-5" id="form1">
                <div class="form-data" v-if="!submitted">
                
                <form:form  action="/login" method="POST" modelAttribute="usuario">
                
                    <div class="forms-inputs mb-4"> <span>Email</span> <form:input path="nombre" class="form-control" autocomplete="off" type="text"  />
                        <div class="invalid-feedback">Nombre de usuario requerido</div>
                    </div>
                    <div class="forms-inputs mb-4"> <span>Password</span> <form:input  path="clave" class="form-control" autocomplete="off" type="password" />
                        <div class="invalid-feedback">Clave incorrecta</div>
                    </div>
                    <div class="mb-3"> <button v-on:click.stop.prevent="submit" class="btn btn-dark w-100">Login</button> </div>
                </div>
          
                
                </form:form>
            </div>
        </div>
    </div>
</div>

${mensaje}

</div>



 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>