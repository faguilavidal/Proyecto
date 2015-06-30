
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarteleraDAL 
{
    private Conexion conn;
    
    public CarteleraDAL()
    {
        conn = new Conexion();
    }
    
    public int idCartelera(int sucursal){
        try
        {
            String sql = "Select codigo from cartelera where codsucursal = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setInt(1, sucursal);
            ResultSet valor = obtener.executeQuery();
            if(valor.next())
            {
                return valor.getInt(1);
            }
            else
            {
                return -1;
            }
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
    
    
}
