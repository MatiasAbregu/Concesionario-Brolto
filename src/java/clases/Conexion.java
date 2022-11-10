package clases;

import java.sql.*;

/**
 * @author Matias
 */
public class Conexion {
    
    public Connection conectar() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/brolto", "root", "");
    }
    
}