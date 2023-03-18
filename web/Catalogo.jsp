<%-- 
    Author: Matias Abregú
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.sql.*"%>
<%@page import="clases.Conexion"%>
<%@page import="clasesPagina.Vehiculo"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Concesionario Brolto - Catálogo</title>
        <link rel="shortcut icon" href="img/ConcesionarioBroltoBlanco.ico"/>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Teko&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="EstiloCatalogo.css">
    </head>

    <%
        Class.forName("com.mysql.jdbc.Driver");

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        try {
            Conexion cn = new Conexion();
            PreparedStatement pst = cn.conectar().prepareStatement("select * from vehiculos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                listaVehiculos.add(new Vehiculo(rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)));
            }

        } catch (Exception e) {
        }

        int nVehiculo = 0;
        pageContext.setAttribute("vehiculos", listaVehiculos);
    %>

    <body>
        <header>
            <a href="Inicio.html"><img src="img/ConcesionarioBroltoBlanco.png" id="Logo"/></a>
            <nav>
                <ul>
                    <li><a href="Inicio.html">Inicio</a></li>
                    <li><a href="#tituloNovedades">Novedades</a></li>
                    <li><a href="Catalogo.jsp">Catálogo</a></li>
                    <li id="margenMarca"><a href="#MarcasDeAutos">Marcas de Autos</a></li>
                </ul>
            </nav>
        </header>


        <section>
            <c:forEach var="vehiculosARecorrer" items="${vehiculos}">
                <style>
                    .articulosDeVehiculos{
                        border: 1vh solid black;
                        border-radius: 1.5vh; 
                        width: 30%;
                        display: inline-block;
                    }
                    
                    .articulosDeVehiculos img{
                        width: 100%;
                    }
                </style>
                <br><br>
                <article class="articulosDeVehiculos">
                    <%
                        byte[] bytesIMG = listaVehiculos.get(nVehiculo).getImagen().getBytes(1, (int) listaVehiculos.get(nVehiculo).getImagen().length());
                        String codificar = Base64.getEncoder().encodeToString(bytesIMG);
                        pageContext.setAttribute("imagenCodificada", codificar);
                        nVehiculo++;
                    %>
                    <img src="data:image/jpeg;base64,${imagenCodificada}">
                    <hr>
                    <h2>${vehiculosARecorrer.getModelo()}</h2>
                    <h3>Marca: ${vehiculosARecorrer.getMarca()} <h3>
                            </article>
                        </c:forEach>
         </section>
    </body>
</html>