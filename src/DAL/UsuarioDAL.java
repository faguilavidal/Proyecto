package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    public BLL.Usuario buscarUserUsuario(String usuario){
        try
        {
            String sql = "select * from usuario where usuario = ?";
            PreparedStatement search = conn.crearSentencia(sql);
            search.setString(1, usuario);
            ResultSet User = search.executeQuery();
            if(User.next())
            {
                BLL.Usuario u = new BLL.Usuario();
                u.setUsuario(User.getString(1));
                u.setContraseña(User.getString(2));
                u.setRut(User.getInt(3));
                u.setNombre(User.getString(4));
                u.setEmail(User.getString(5));
                u.setEstadoEmail(User.getInt(6));
                u.setEstadousuario(User.getInt(7));
                u.setIdTipoUsuario(User.getInt(8));
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
                u.setUsuario(User.getString(1));
                u.setContraseña(User.getString(2));
                u.setRut(User.getInt(3));
                u.setNombre(User.getString(4));
                u.setEmail(User.getString(5));
                u.setEstadoEmail(User.getInt(6));
                u.setEstadousuario(User.getInt(7));
                u.setIdTipoUsuario(User.getInt(8));
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
            String sql = "insert into usuario values(?,?,?,?,?,0,0,0)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setString(1,u.getUsuario());
            insert.setString(2, u.getContraseña());
            insert.setInt(3, u.getRut());
            insert.setString(4, u.getNombre());
            insert.setString(5, u.getEmail());
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
}
