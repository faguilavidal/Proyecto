package DAL;
/**
 *
 * @author Fabian Aguila
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    
    private Connection conn;
    
    public Conexion(){
        verificarControlador();
        conectarse();
    }
    
    private void verificarControlador(){
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Controlador verificado...");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Falta cargar controlador..." + e.getMessage());
        }
    }
    
    private void conectarse(){
        try
        {   
            String database = "Cine de Mark";
            String user = "CINE";
            String password = "oracle";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,password);
          //conn = DriverManager.getConnection("jdbc:oracle:thin://192.168.43.135:1521:XE/",user,password); REMOTO  
            System.out.println("Conectado correctamente a " + database);
        }
        catch(SQLException e)
        {
            System.out.println("Base de datos desconocida..." + e.getMessage());
        }
    }
    
    public PreparedStatement crearSentencia(String sql){
        try
        {
            return conn.prepareStatement(sql);
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    

    
    
    
    
    
}
