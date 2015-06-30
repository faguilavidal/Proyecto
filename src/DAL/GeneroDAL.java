
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GeneroDAL 
{
    private Conexion conn;
    
    public GeneroDAL()
    {
        conn = new Conexion();
    }
    
    public ArrayList<BLL.Genero> selectGenero(){
        try
        {
            ArrayList<BLL.Genero> Genero = new ArrayList<>();
            String sql = "select * from genero order by nombre";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                Genero.add(new BLL.Genero(listado.getInt(1), listado.getString(2)));
            }
            return Genero;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int idGenero(String Genero) {
        try
        {
            String sql = "Select codigo from genero where nombre = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setString(1, Genero);
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
    
    public String obtenerNombreGenero(int id){
        try
        {
            String sql = "Select nombre from genero where codigo = ?";
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
