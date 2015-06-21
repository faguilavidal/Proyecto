
package BLL;

import java.util.ArrayList;

public class TipoCliente
{
    private int codigo;
    private String nombre;

    public TipoCliente() {
    }

    public TipoCliente(int codigo, String nombre) {
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
    
    public ArrayList<TipoCliente> listadoTipoCliente(){
        return new DAL.TipoClienteDAL().selectTipoCliente();
    }
    
    public int obtenerIdTipoCliente(String nombre){
        return new DAL.TipoClienteDAL().idTipoCliente(nombre);
    }
    
    public String obtenerNombreTipoCliente(int id){
        return new DAL.TipoClienteDAL().obtenerNombreTipoCliente(id);
    }
    
}
