<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SG SST</title>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css"/>
<link href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css"/>
<style type="text/css">

.errores{

color:red;
font-size:70%;

}

</style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
<div class="container-fluid">
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
<span class="fa fa-bars"></span> Menu
</button>
<div class="collapse navbar-collapse" id="ftco-nav">
<ul class="navbar-nav m-auto">
<li class="nav-item active"><a href="#" class="nav-link">Home</a></li>

<li class="nav-item"><a href="/listarEmpleado" class="nav-link">Empleados</a></li>
<li class="nav-item"><a href="/listarUser" class="nav-link">Usuarios</a></li>
<li class="nav-item"><a href="/listarIncapacidad" class="nav-link">Ausentismos</a></li>
<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#">Reportes</a>
<ul class="dropdown-menu">
      <li><a class="dropdown-item" href="/reporteArea">Por Area de trabajo</a></li>
      <li><a class="dropdown-item" href="/reporteTipo">Por tipo de Incapacidad</a></li>
      <li><a class="dropdown-item" href="/reporteCuentas">Por estado de cuentas</a></li>      
      <li><a class="dropdown-item" href="/reporteEmpleado">Por Empleado</a></li>
    </ul>

</li>
</ul>

 <ul class="navbar-nav ml-auto">
 <li class="nav-item"><a href="/cerrarSess" class="nav-link">Cerrar Sesi�n</a></li>
 </ul>
</div>
</div>
</nav>



