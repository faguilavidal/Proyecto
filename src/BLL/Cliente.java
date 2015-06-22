
package BLL;

import java.util.Date;

public class Cliente 
{
    private int rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String fechaNac;
    private int membresia;
    private int comuna;
    private int sucursal;

    public Cliente() {
    }

    public Cliente(int rut, String nombre, String apellido, String direccion, int telefono, String fechaNac, int membresia, int comuna, int sucursal) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.membresia = membresia;
        this.comuna = comuna;
        this.sucursal = sucursal;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getMembresia() {
        return membresia;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }
    
    
    public int registrarClienteBLL(int rut, String nombre, String apellido, String direccion, int telefono, String fechaNac, String membresia, String comuna, String sucursal){
        Cliente c = new Cliente( rut,  nombre,  apellido,  direccion,  telefono,  fechaNac, 
                                new DAL.TipoClienteDAL().idTipoCliente(membresia),
                                new DAL.ComunaDAL().idComuna(comuna),
                                new DAL.SucursalDAL().idSucursal(sucursal));
        int resultado = new DAL.ClienteDAL().insertCliente(c);
        return resultado;
    }
    
    public Cliente buscarCliente(int Cliente){
        return new DAL.ClienteDAL().buscarCliente(Cliente);
    }
    /*
     public int actualizarBilletera(int billetera, String username){
        int resultado = new DAL.UserDAL().updateBilleteraUser(billetera,username);
        return resultado;
     }
     
      public ArrayList<User> listadoUser(){
        return new DAL.UserDAL().ConsultarUser();
     }
    */
    
}
