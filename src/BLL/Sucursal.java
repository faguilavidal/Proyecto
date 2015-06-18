package BLL;

import java.util.ArrayList;

/**
 *
 * @author Fabian Aguila
 */
public class Sucursal {
    private int codigo;
    private String nombre;
    private String direccion;
    private  int codMall;
    private int codComuna;

    public Sucursal() {
    }

    public Sucursal(int codigo, String nombre, String direccion, int codMall, int codComuna) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codMall = codMall;
        this.codComuna = codComuna;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodMall() {
        return codMall;
    }

    public void setCodMall(int codMall) {
        this.codMall = codMall;
    }

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public ArrayList<Sucursal> listadoSucursales(){
        return new DAL.SucursalDAL().selectSucursales();
    }
    
    public int obtenerIdSucursal(String nombre){
        return new DAL.SucursalDAL().idSucursal(nombre);
    }
    
    public String obtenerNombreSucursal(int id){
        return new DAL.SucursalDAL().obtenerNombreSucursal(id);
    }
}
