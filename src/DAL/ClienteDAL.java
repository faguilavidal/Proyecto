
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAL 
{
    private Conexion conn;
    
    public ClienteDAL()
    {
        conn = new Conexion();
    }
    
    public int insertCliente(BLL.Cliente c)
    {
        try
        {
            String sql = "insert into cliente values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            
            insert.setInt(1, c.getRut());
            insert.setString(2, c.getNombre());
            insert.setString(3, c.getApellido());
            insert.setString(4, c.getDireccion());
            insert.setInt(5, c.getTelefono());
            insert.setString(6, c.getFechaNac());
            insert.setInt(7, c.getMembresia());
            insert.setInt(8, c.getComuna());
            insert.setInt(9, c.getSucursal());
            
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());// hay un error
            return e.getErrorCode();
        }
    }
    /*
    public int updateSucursal(int codigo)
    {
        try
        {
            String sql = "update sucursal set codigo = ? where codigo = ?";
            PreparedStatement update = conn.crearSentencia(sql);
            
            update.setInt(1, codigo);
            
            return update.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }*/
    
    /*public int deleteSucursal(int codigo)
    {
        try
        {
            String sql = "delete sucursal where codigo = ?";
            PreparedStatement delete = conn.crearSentencia(sql);
            
            delete.setInt(1, codigo);
            
            return delete.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }*/
    
    public BLL.Cliente buscarCliente(int rut)
    {
        try
        {
            String sql = "select * from cliente where rut = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            
            select.setInt(1, rut);
            
            ResultSet cliente = select.executeQuery();
            
            if(cliente.next())
            {
                BLL.Cliente c = new BLL.Cliente();
                c.setRut(cliente.getInt(1));
                c.setNombre(cliente.getString(2));
                c.setApellido(cliente.getString(3));
                c.setDireccion(cliente.getString(4));
                c.setTelefono(cliente.getInt(5));
                c.setFechaNac(cliente.getString(6));
                c.setMembresia(cliente.getInt(7));
                c.setComuna(cliente.getInt(8));
                c.setSucursal(cliente.getInt(9));
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
    
    /*
    public ArrayList<BLL.Sucursal> selectSucursales()
    {
        try
        {
            ArrayList<BLL.Sucursal> sucursales = new ArrayList<>();
            String sql = "select * from sucursal";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet sucursal = select.executeQuery();
            
            if(sucursal.next())
            {
                BLL.Sucursal s = new BLL.Sucursal();
                s.setCodigo(sucursal.getInt(1));
                s.setCodComuna(sucursal.getInt(2));
                s.setCodMall(sucursal.getInt(3));
                s.setDireccion(sucursal.getString(4));
                
                sucursales.add(s);
            }
            
            return sucursales;
        }
        catch(SQLException e)
        {
            return null;
        }
    }*/
}
