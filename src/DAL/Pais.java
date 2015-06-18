
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Pais 
{
    private Conexion conn;
    
    public Pais()
    {
        conn = new Conexion();
    }
    
    public int insertPais(BLL.Pais p)
    {
        try
        {
            String sql = "insert into pais values(?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            
            insert.setInt(1, p.getCodigo());
            insert.setString(2, p.getNombre());
            
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public int updatePais(String nombre)
    {
        try
        {
            String sql = "update pais set nombre = ? where nombre = ?";
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
    
    public int deletePais(String nombre)
    {
        try
        {
            String sql = "delete pais where nombre = ?";
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
    
    public BLL.Pais selectPais(String nombre)
    {
        try
        {
            String sql = "select * from pais where nombre = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            
            select.setString(1, nombre);
            
            ResultSet pais = select.executeQuery();
            
            if(pais.next())
            {
                BLL.Pais p = new BLL.Pais();
                p.setCodigo(pais.getInt(1));
                p.setNombre(pais.getString(2));
                
                return p;
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
    
    public ArrayList<BLL.Pais> selectPaises()
    {
        try
        {
            ArrayList<BLL.Pais> paises = new ArrayList<>();
            String sql = "select * from pais";
            PreparedStatement select = conn.crearSentencia(sql);
            
            ResultSet pais = select.executeQuery();
            
            if(pais.next())
            {
                BLL.Pais p = new BLL.Pais();
                p.setCodigo(pais.getInt(1));
                p.setNombre(pais.getString(2));
                
                paises.add(p);
            }
            
            return paises;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
}
