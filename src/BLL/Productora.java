
package BLL;

import java.util.ArrayList;

public class Productora 
{
    private int codigo;
    private String nombre;

    public Productora() {
    }

    public Productora(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public ArrayList<Productora> listadoProductora(){
        return new DAL.ProductoraDAL().selectProductora();
    }
    
    public int obtenerIdProductora(String nombre){
        return new DAL.ProductoraDAL().idProductora(nombre);
    }
    
    public String obtenerNombreProductora(int id){
        return new DAL.ProductoraDAL().obtenerNombreProductora(id);
    }
}
