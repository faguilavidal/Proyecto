
package BLL;

import java.util.Date;

public class Cliente 
{
    private int rut;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private int codTipoCliente;

    public Cliente() {
    }

    public Cliente(int rut, String nombre, String apellido, Date fechaNac, int codTipoCliente) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.codTipoCliente = codTipoCliente;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getCodTipoCliente() {
        return codTipoCliente;
    }

    public void setCodTipoCliente(int codTipoCliente) {
        this.codTipoCliente = codTipoCliente;
    }
}
