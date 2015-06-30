
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PeliculaDAL 
{
    private Conexion conn;
    
    public PeliculaDAL()
    {
        conn = new Conexion();
    }
    
    public int maxPelicula(){
        try
        {
            String sql = "select max(idpelicula) from pelicula";
            PreparedStatement count = conn.crearSentencia(sql);
            ResultSet valor = count.executeQuery();
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
    
    public int InsertarPelicula(BLL.Pelicula p){
        try
        {
            String sql = "insert into pelicula values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            
            insert.setInt(1, p.getCodigo());
            insert.setString(2, p.getNombre());
            insert.setString(3, p.getSinopsis());
            insert.setInt(4, p.getCensura());
            insert.setString(5, p.getFecProduccion());
            insert.setString(6, p.getFecEstreno());
            insert.setString(7, p.getPagWeb());
            insert.setInt(8, p.getEstado());
            insert.setInt(9, p.getCodProductora());
            insert.setInt(10, p.getCodGenero());
            insert.setInt(11, p.getCodPais());
            
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            //JOptionPane.showMessageDialog(null, e.getMessage()+ "\n" + e.getErrorCode());
            return e.getErrorCode();
        }
     }
    
    public int UpdatePelicula(BLL.Pelicula p){
        try
        {
            String sql = "update pelicula set nombre = ?,sinopsis = ?,censura = ?,fechaprod = ?,fechaest = ?,paginaweb = ?,estado = ?,codproductora = ?,codgenero = ?,codpais = ? where idpelicula = ?";
            PreparedStatement update = conn.crearSentencia(sql);
            
            update.setString(1, p.getNombre());
            update.setString(2, p.getSinopsis());
            update.setInt(3, p.getCensura());
            update.setString(4, p.getFecProduccion());
            update.setString(5, p.getFecEstreno());
            update.setString(6, p.getPagWeb());
            update.setInt(7, p.getEstado());
            update.setInt(8, p.getCodProductora());
            update.setInt(9, p.getCodGenero());
            update.setInt(10, p.getCodPais());
            update.setInt(11, p.getCodigo());
            
            return update.executeUpdate();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage()+ "\n" + e.getErrorCode());
            return e.getErrorCode();
        }
     }
    
    public int deletePelicula(int codigo){
        try
        {
            String sql = "delete from pelicula where idpelicula = ?";
            PreparedStatement delete = conn.crearSentencia(sql);
            delete.setInt(1, codigo);
            return delete.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public BLL.Pelicula buscarPelicula(int pelicula){
        try
        {
            String sql = "select * from pelicula where idpelicula = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            
            select.setInt(1, pelicula);
            
            ResultSet peli = select.executeQuery();
            
            if(peli.next())
            {
                BLL.Pelicula p = new BLL.Pelicula();
                p.setCodigo(peli.getInt(1));
                p.setNombre(peli.getString(2));
                p.setSinopsis(peli.getString(3));
                p.setCensura(peli.getInt(4));
                p.setFecProduccion(peli.getString(5));
                p.setFecEstreno(peli.getString(6));
                p.setPagWeb(peli.getString(7));
                p.setEstado(peli.getInt(8));
                p.setCodProductora(peli.getInt(9));
                p.setCodGenero(peli.getInt(10));
                p.setCodPais(peli.getInt(11));
                return p;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage()+ "\n" + e.getErrorCode());
            return null;
        }
    }
}
     
