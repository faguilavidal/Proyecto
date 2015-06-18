package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian Aguila
 */
public class UsuarioDAL {
    private Conexion conn;

    public UsuarioDAL() {
        conn = new Conexion();
    }
    ////////////////////////////////////////////////////////////////
    /////////////////////METODOS DE LA CLASE////////////////////////
    ////////////////////////////////////////////////////////////////
    
    public BLL.Usuario buscarUserUsuario(int usuario){
        try
        {
            String sql = "select * from usuario where rut = ?";
            PreparedStatement search = conn.crearSentencia(sql);
            search.setInt(1, usuario);
            ResultSet User = search.executeQuery();
            if(User.next())
            {
                BLL.Usuario u = new BLL.Usuario();
                u.setRut(User.getInt(1));
                u.setContraseña(User.getString(2));
                u.setNombre(User.getString(3));
                u.setApellido(User.getString(4));
                u.setEmail(User.getString(5));
                u.setIdTipoUsuario(User.getInt(6));
                u.setIdSucursal(User.getInt(7));
                return u;
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
    
    public BLL.Usuario buscarUserEmail(String email){
        try
        {
            String sql = "select * from usuario where email = ?";
            PreparedStatement search = conn.crearSentencia(sql);
            search.setString(1, email);
            ResultSet User = search.executeQuery();
            if(User.next())
            {
                BLL.Usuario u = new BLL.Usuario();
                u.setRut(User.getInt(1));
                u.setContraseña(User.getString(2));
                u.setNombre(User.getString(3));
                u.setApellido(User.getString(4));
                u.setEmail(User.getString(5));
                u.setIdTipoUsuario(User.getInt(6));
                u.setIdSucursal(User.getInt(7));
                return u;
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
    
    public int insertUser(BLL.Usuario u){
        try
        {
            String sql = "insert into usuario values(?,?,?,?,?,0,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setInt(1,u.getRut());
            insert.setString(2, u.getContraseña());
            insert.setString(3, u.getNombre());
            insert.setString(4, u.getApellido());
            insert.setString(5, u.getEmail());
            insert.setInt(6, u.getIdSucursal());
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            //JOptionPane.showMessageDialog(null, e.getMessage());
            return e.getErrorCode();
        }
    }
}
