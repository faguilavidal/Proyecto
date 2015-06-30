
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PaisDAL 
{
    private Conexion conn;
    
    public PaisDAL()
    {
        conn = new Conexion();
    }
    
    public ArrayList<BLL.Pais> selectPais(){
        try
        {
            ArrayList<BLL.Pais> Pais = new ArrayList<>();
            String sql = "select * from pais order by nombre";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                Pais.add(new BLL.Pais(listado.getInt(1), listado.getString(2)));
            }
            return Pais;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int idPais(String Pais) {
        try
        {
            String sql = "Select codpais from pais where nombre = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setString(1, Pais);
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
    
    public String obtenerNombrePais(int id){
        try
        {
            String sql = "Select nombre from pais where codpais = ?";
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
