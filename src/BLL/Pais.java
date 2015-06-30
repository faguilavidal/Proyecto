
package BLL;

import java.util.ArrayList;

public class Pais 
{
    private int codigo;
    private String nombre;

    public Pais() {
    }

    public Pais(int codigo, String nombre) {
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
    
    
    public ArrayList<Pais> listadoPais(){
        return new DAL.PaisDAL().selectPais();
    }
    
    public int obtenerIdPais(String nombre){
        return new DAL.PaisDAL().idPais(nombre);
    }
    
    public String obtenerNombrePais(int id){
        return new DAL.PaisDAL().obtenerNombrePais(id);
    }
}
