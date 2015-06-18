
package BLL;

public class Mall 
{
    private int codigo;
    private String nombre;
    private int codComuna;
    private String direccion;

    public Mall() {
    }

    public Mall(int codigo, String nombre, int codComuna, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codComuna = codComuna;
        this.direccion = direccion;
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

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
