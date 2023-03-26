<%-- 
    Author     : Matias
--%>

<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page import="clases.Conexion"%>
<%@page import="clasesPagina.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%
        int ID = Integer.parseInt(request.getParameter("ID"));

        Class.forName("com.mysql.jdbc.Driver");

        ArrayList<Vehiculo> objetoVehiculo = new ArrayList<Vehiculo>();

        try {
            Conexion cn = new Conexion();
            PreparedStatement pst = cn.conectar().prepareStatement("select * from vehiculos where ID = ?");
            pst.setInt(1, ID);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                //String modelo, String marca, String descripcion, Blob imagen
                objetoVehiculo.add(new Vehiculo(rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)));
            }

        } catch (Exception e) {
        }

        pageContext.setAttribute("Modelo", objetoVehiculo.get(0).getModelo());
        pageContext.setAttribute("Marca", objetoVehiculo.get(0).getMarca());
        pageContext.setAttribute("Descripcion", objetoVehiculo.get(0).getDescripcion());
    %>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Concesionario Brolto - ${Modelo} </title>
        <link rel="shortcut icon" href="img/ConcesionarioBroltoBlanco.ico"/>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Teko&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="EstiloMV.css"/>
    </head>

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
            <style>
                h1{
                    margin-top: 2vh;
                    background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(34, 113, 179, 1), rgba(0, 0, 0, 0));
                    font-size: 8vh;
                    color: white;
                }

               article img{
                   width: 50%;
                    float: right;
                    border: 1vh solid rgba(34, 113, 179, 1);
                    border-radius: 3vh;
                    margin-right: 2vh;
                }

                #centrar{
                    float: left;    
                    width: 45%;
                    display: inline-block;
                }
                
                #centrar h2{
                    margin: 0;
                    background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(34, 113, 179, 1), rgba(0, 0, 0, 0));
                    text-align: center;
                    font-size: 6vh;
                    color: white;
                }
                
                #bordeado {
                    z-index: -1;
                    width: 45%;
                    float: left;
                    position: relative;
                    margin-left: 2vh;
                    background: linear-gradient(to right, black, rgba(34, 113, 179, 1));
                    border-radius: 2vh;
                }

                #bordeado p{
                    margin: 1vh;
                    padding: 1vh;
                    border-radius: 1.6vh;
                    background: white;
                    font-size: 4vh;
                }
            </style>
            <center><h1>Vehiculo: ${Modelo}</h1></center>
            <article>
                <span id="centrar"><h2>Descripción:</h2></span>
                <br><br><br><br>
                <span id="bordeado">
                    <p>${Descripcion}</p>
                </span>
                         
                <img src="data:image/jpeg;base64,<%
                    byte[] imgEnByte = objetoVehiculo.get(0).getImagen().getBytes(1, (int) objetoVehiculo.get(0).getImagen().length());
                    String codificar = Base64.getEncoder().encodeToString(imgEnByte);
                    pageContext.setAttribute("Imagen", codificar);
                     %> 
                     ${Imagen}"/>          
            </article>
        </section>
            <br><br><br>    
       <footer>
            <p>© Derechos reservados a Matias Abregú 2023</p>
            <a href="https://api.whatsapp.com/send?phone=3512753590" target="_blank">Contactame aqui</a>
        </footer>
    </body>

</html>
