
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoClienteDAL 
{
    private Conexion conn;
    
    public TipoClienteDAL()
    {
        conn = new Conexion();
    }
    
    public ArrayList<BLL.TipoCliente> selectTipoCliente(){
        try
        {
            ArrayList<BLL.TipoCliente> TipoCliente = new ArrayList<>();
            String sql = "select * from tipocliente order by nombre";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                TipoCliente.add(new BLL.TipoCliente(listado.getInt(1), listado.getString(2)));
            }
            return TipoCliente;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int idTipoCliente(String TipoCliente) {
        try
        {
            String sql = "Select idtipocliente from tipocliente where nombre = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setString(1, TipoCliente);
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
    
    public String obtenerNombreTipoCliente(int id){
        try
        {
            String sql = "Select nombre from tipocliente where idtipocliente = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setInt(1, id);
            ResultSet valor = obtener.executeQuery();
            if(valor.next())
            {
                return valor.getString(1);
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
}
