
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Comuna 
{
    private Conexion conn;
    
    public Comuna()
    {
        conn = new Conexion();
    }
    
    public int insertComuna(BLL.Comuna c)
    {
        try
        {
            String sql = "insert into comuna values(?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            
            insert.setInt(1, c.getCodigo());
            insert.setString(2, c.getNombre());
            insert.setInt(3, c.getCodCiudad());
            
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public int updateComuna(String nombre)
    {
        try
        {
            String sql = "update comuna set nombre = ? where nombre = ?";
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
    
    public int deleteComuna(String nombre)
    {
        try
        {
            String sql = "delete comuna where nombre = ?";
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
    
    public BLL.Comuna selectComuna(String nombre)
    {
        try
        {
            String sql = "select * from comuna where nombre = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            
            select.setString(1, nombre);
            
            ResultSet comuna = select.executeQuery();
            
            if(comuna.next())
            {
                BLL.Comuna c = new BLL.Comuna();
                c.setCodigo(comuna.getInt(1));
                c.setNombre(comuna.getString(2));
                c.setCodCiudad(comuna.getInt(3));
                
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
    
    public ArrayList<BLL.Comuna> selectComunas()
    {
        try
        {
            ArrayList<BLL.Comuna> comunas = new ArrayList<>();
            String sql = "select * from comuna";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet comuna = select.executeQuery();
            
            if(comuna.next())
            {
                BLL.Comuna c = new BLL.Comuna();
                c.setCodigo(comuna.getInt(1));
                c.setNombre(comuna.getString(2));
                c.setCodCiudad(comuna.getInt(3));
                
                comunas.add(c);
            }
            
            return comunas;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
}
