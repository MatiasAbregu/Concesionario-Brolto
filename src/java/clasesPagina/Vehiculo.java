package clasesPagina;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import javax.imageio.ImageIO;

/**
 * @author Matias
 */
public class Vehiculo {

    private String modelo, marca, descripcion;
    private Blob imagenBlob;

    public Vehiculo(String modelo, String marca, String descripcion, Blob imagen) {
        this.modelo = modelo;
        this.marca = marca;
        this.descripcion = descripcion;
        imagenBlob = imagen;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Blob getImagen(){
        return imagenBlob;
    }
    
    /*
    public BufferedImage getImagen() throws IOException, SQLException {
        InputStream imagenConversor = imagenBlob.getBinaryStream();
        BufferedImage imagenConvertida = ImageIO.read(imagenConversor);
        return imagenConvertida;
    }*/

}
