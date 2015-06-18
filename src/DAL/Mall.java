
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Mall 
{
    private Conexion conn;
    
    public Mall()
    {
        conn = new Conexion();
    }
    
    public int insertMall(BLL.Mall m)
    {
        try
        {
            String sql = "insert into mall values(?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            
            insert.setInt(1, m.getCodigo());
            insert.setString(2, m.getNombre());
            insert.setInt(3, m.getCodComuna());
            insert.setString(4, m.getDireccion());
            
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public int updateMall(String nombre)
    {
        try
        {
            String sql = "update mall set nombre = ? where nombre = ?";
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
    
    public int deleteMall(String nombre)
    {
        try
        {
            String sql = "delete mall where nombre = ?";
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
    
    public BLL.Mall selectMall(String nombre)
    {
        try
        {
            String sql = "select * from mall where nombre = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            
            select.setString(1, nombre);
            
            ResultSet mall = select.executeQuery();
            
            if(mall.next())
            {
                BLL.Mall m = new BLL.Mall();
                m.setCodigo(mall.getInt(1));
                m.setNombre(mall.getString(2));
                
                return m;
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
    
    public ArrayList<BLL.Mall> selectMalls()
    {
        try
        {
            ArrayList<BLL.Mall> malls = new ArrayList<>();
            String sql = "select * from mall";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet mall = select.executeQuery();
            
            if(mall.next())
            {
                BLL.Mall m = new BLL.Mall();
                m.setCodigo(mall.getInt(1));
                m.setNombre(mall.getString(2));
                
                malls.add(m);
            }
            
            return malls;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
}
