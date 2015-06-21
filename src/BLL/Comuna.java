
package BLL;

import java.util.ArrayList;

public class Comuna 
{
    private int codigo;
    private String nombre;
    private int codCiudad;

    public Comuna() {
    }

    public Comuna(int codigo, String nombre, int codCiudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codCiudad = codCiudad;
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

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public ArrayList<Comuna> listadoComunas(){
        return new DAL.ComunaDAL().selectComunas();
    }
    
    public int obtenerIdComuna(String nombre){
        return new DAL.ComunaDAL().idComuna(nombre);
    }
    
    public String obtenerNombreComuna(int id){
        return new DAL.ComunaDAL().obtenerNombreComuna(id);
    }
    
    
}
