<%-- 
    Document   : head
    Created on : 8 oct 2021, 12:04:53
    Author     : Lichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cursos PDHN</title>

        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/resource/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/resource/css/sheetslider.min.css"/>
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/resource/css/style.css"/>

        <script src="${pageContext.request.contextPath}/resource/js/jquery-3.6.0.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/resource/js/bootstrap.bundle.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/resource/js/registrar.js" type="text/javascript"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-toggleable-sm navbar-light
             bg-white border-bottom box-shadow mb-3">
            <div class="container">
                <a class="navbar-brand">
                    <img src="${pageContext.request.contextPath}/resource/images/logo-google.png" 
                         class="imglogo"/>Usuarios
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target=".navbar-collapse" aria-controls="navbarSupportedContent">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div id="menuNavbar">
                    <div class="navbar-collapse collapser d-sm-inline-flex flex-sm-row-reverse">
                        <ul class="navbar-nav">
                            <li class="navbar-nav">
                                <button onclick="" class=" nav-link btn btn-link text-dark">
                                    Cerrar sesión
                                </button>
                            </li>
                        </ul>
                        <ul class="navbar-nav flex-grow-1">
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="${pageContext.request.contextPath}">
                                  Home  
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/registrar/">
                                  Registrar  
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>   

