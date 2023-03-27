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
        String tipoDeMarca = request.getParameter("marca");
        Class.forName("com.mysql.jdbc.Driver");

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        try {
            Conexion cn = new Conexion();
            PreparedStatement pst = cn.conectar().prepareStatement("select * from vehiculos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                if (tipoDeMarca == null) {
                    listaVehiculos.add(new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBlob(5)));
                } else if (tipoDeMarca.equals("Ford")) {
                    if (rs.getString(3).toLowerCase().equals("ford")) {
                    listaVehiculos.add(new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBlob(5)));
                    }
                } else if (tipoDeMarca.equals("Chevrolet")) {
                    if (rs.getString(3).toLowerCase().equals("chevrolet")) {
                    listaVehiculos.add(new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBlob(5)));
                    }
                } else if (tipoDeMarca.equals("BMW")) {
                    if (rs.getString(3).toLowerCase().equals("bmw")) {
                    listaVehiculos.add(new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBlob(5)));
                    }
                } else if (tipoDeMarca.equals("Audi")) {
                    if (rs.getString(3).toLowerCase().equals("audi")) {
                    listaVehiculos.add(new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBlob(5)));
                    }
                } else if (tipoDeMarca.equals("Porsche")) {
                    if (rs.getString(3).toLowerCase().equals("porsche")) {
                    listaVehiculos.add(new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBlob(5)));
                    }
                }
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
                    <li><a href="Inicio.html#tituloNovedades">Novedades</a></li>
                    <li><a href="Catalogo.jsp">Catálogo</a></li>
                    <li id="margenMarca"><a href="Inicio.html#MarcasDeAutos">Marcas de Autos</a></li>
                </ul>
            </nav>
        </header>


        <section>         
            <br><br><br>
            <style>
                section{
                    display: flex;
                    flex-wrap: wrap;
                }

                hr{
                    margin-top: -1.3vh;
                    border: 0.4vh solid black;
                }

                form{
                    width: 30%;
                    margin: 2% 1.6% 2% 1.6%;
                }

                .articulosDeVehiculos{
                    z-index: -1;
                    text-align: center;
                    border: 0.7vh solid black;
                    border-radius: 1.5vh;
                    width: 100%;
                    display: inline-block;
                    transition: ease-out 0.3s;
                }

                .articulosDeVehiculos:hover{
                    transform: scale(1.05,1.05);
                }

                .articulosDeVehiculos:hover h2{
                    animation: animacionSlide 0.7s infinite linear;
                }

                @keyframes animacionSlide{
                    0%{
                        background-image: linear-gradient(to right, rgba(34, 113, 179, 0.5), rgba(34, 113, 179, 1), rgba(34, 113, 179, 0.1))
                    }
                    50%{
                        background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(34, 113, 179, 0.5), rgba(34, 113, 179, 1))
                    }
                    100%{
                        background-image: linear-gradient(to right, rgba(34, 113, 179, 1), rgba(34, 113, 179, 0.5), rgba(0, 0, 0, 0))
                    }
                }

                .articulosDeVehiculos h2{
                    background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(34, 113, 179, 1), rgba(0, 0, 0, 0));
                    color: white;
                    font-size: 6vh;
                    margin-top: -1.3vh;
                }

                .articulosDeVehiculos img{
                    border-radius: 1.2vh;
                    width: 100%;
                }

                .articulosDeVehiculos h3{
                    font-size: 5vh;
                    margin: -4vh 0 0.2vh 0;
                }

                button{
                    margin-bottom: 2vh;
                    font-family: 'Teko', sans-serif;
                    font-size: 4vh;
                    border: hidden;
                    width: 70%;
                    height: 6vh;
                    border-radius: 10vh;
                    color: white;
                    background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(34, 113, 179, 1), rgba(0, 0, 0, 0));
                    transition: ease 0.3s;
                }

                button:hover{
                    box-shadow: gray 0.5vh 0.5vh;
                    cursor: pointer;
                }

            </style>
            <c:forEach var="vehiculosARecorrer" items="${vehiculos}">
                <br><br>
                <form action="MostrarVehiculo.jsp" method="post">
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
                        <h3>Marca: ${vehiculosARecorrer.getMarca()} </h3>
                        <input hidden="" name="ID" value="${vehiculosARecorrer.getID()}" readonly=""/>  
                        <button type="submit">VER VEHICULO</button>
                    </article>
                </form>
            </c:forEach>
        </section>

        <footer>
            <p>© Derechos reservados a Matias Abregú 2023</p>
            <a href="https://api.whatsapp.com/send?phone=3512753590" target="_blank">Contactame aqui</a>
        </footer>
    </body>
</html>