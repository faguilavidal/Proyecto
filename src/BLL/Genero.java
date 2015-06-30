
package BLL;

import java.util.ArrayList;

public class Genero 
{
    private int codigo;
    private String nombre;

    public Genero() {
    }

    public Genero(int codigo, String nombre) {
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
    
    
    public ArrayList<Genero> listadoGenero(){
        return new DAL.GeneroDAL().selectGenero();
    }
    
    public int obtenerIdGenero(String nombre){
        return new DAL.GeneroDAL().idGenero(nombre);
    }
    
    public String obtenerNombreGenero(int id){
        return new DAL.GeneroDAL().obtenerNombreGenero(id);
    }
}
