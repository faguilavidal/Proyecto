package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoraDAL 
{
    private Conexion conn;
    
    public ProductoraDAL()
    {
        conn = new Conexion();
    }
    
    public ArrayList<BLL.Productora> selectProductora(){
        try
        {
            ArrayList<BLL.Productora> Productora = new ArrayList<>();
            String sql = "select * from productora order by nombre";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                Productora.add(new BLL.Productora(listado.getInt(1), listado.getString(2)));
            }
            return Productora;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int idProductora(String Productora) {
        try
        {
            String sql = "Select codproductora from productora where nombre = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setString(1, Productora);
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
    
    public String obtenerNombreProductora(int id){
        try
        {
            String sql = "Select nombre from productora where codproductora = ?";
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
