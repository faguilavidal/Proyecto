
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComunaDAL 
{
    private Conexion conn;
    
    public ComunaDAL()
    {
        conn = new Conexion();
    }
    
    public ArrayList<BLL.Comuna> selectComunas(){
        try
        {
            ArrayList<BLL.Comuna> comuna = new ArrayList<>();
            String sql = "select * from comuna order by nombre";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                comuna.add(new BLL.Comuna(listado.getInt(1), listado.getString(2), listado.getInt(3)));
            }
            return comuna;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int idComuna(String Comuna) {
        try
        {
            String sql = "Select idcomuna from comuna where nombre = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setString(1, Comuna);
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
    
    public String obtenerNombreComuna(int id){
        try
        {
            String sql = "Select nombre from comuna where idcomuna = ?";
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
