package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fabian Aguila
 */
public class SucursalDAL {
    private Conexion conn;
    
    public SucursalDAL(){
        conn = new Conexion();
    }
    
    public ArrayList<BLL.Sucursal> selectSucursales(){
        try
        {
            ArrayList<BLL.Sucursal> Sucursal = new ArrayList<>();
            String sql = "select * from sucursal order by nombre";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                Sucursal.add(new BLL.Sucursal(listado.getInt(1), listado.getString(2), listado.getString(3), listado.getInt(4), listado.getInt(5)));
            }
            return Sucursal;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int idSucursal(String Sucursal) {
        try
        {
            String sql = "Select idsucursal from sucursal where  nombre = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setString(1, Sucursal);
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
    
    public String obtenerNombreSucursal(int id){
        try
        {
            String sql = "Select nombre from sucursal where idsucursal = ?";
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
