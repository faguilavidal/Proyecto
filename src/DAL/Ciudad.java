
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ciudad 
{
    private Conexion conn;
    
    public Ciudad()
    {
        conn = new Conexion();
    }
    
    public int insertCiudad(BLL.Ciudad c)
    {
        try
        {
            String sql = "insert into ciudad values(?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            
            insert.setInt(1, c.getCodigo());
            insert.setString(2, c.getNombre());
            
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public int updateCiudad(String nombre)
    {
        try
        {
            String sql = "update ciudad set nombre = ? where nombre = ?";
            PreparedStatement update = conn.crearSentencia(sql);
            
            update.setString(1, nombre);
            update.setString(2, nombre);
            
            return update.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public int deleteCiudad(String nombre)
    {
        try
        {
            String sql = "delete ciudad where nombre = ?";
            PreparedStatement delete = conn.crearSentencia(sql);
            
            delete.setString(1, nombre);
            delete.setString(2, nombre);
            
            return delete.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public BLL.Ciudad selectCiudad(String nombre)
    {
        try
        {
            String sql = "select * from ciudad where nombre = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            
            select.setString(1, nombre);
            
            ResultSet ciudad = select.executeQuery();
            
            if(ciudad.next())
            {
                BLL.Ciudad c = new BLL.Ciudad();
                c.setCodigo(ciudad.getInt(1));
                c.setNombre(ciudad.getString(2));
                
                return c;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public ArrayList<BLL.Ciudad> selectCiudades()
    {
        try
        {
            ArrayList<BLL.Ciudad> ciudades = new ArrayList<>();
            String sql = "select * from ciudad";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet ciudad = select.executeQuery();
            
            if(ciudad.next())
            {
                BLL.Ciudad c = new BLL.Ciudad();
                c.setCodigo(ciudad.getInt(1));
                c.setNombre(ciudad.getString(2));
                
                ciudades.add(c);
            }
            
            return ciudades;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
}
