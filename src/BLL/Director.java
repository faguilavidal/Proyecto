
package BLL;

public class Director 
{
    private int codigo;
    private String nombre;
    private int codPais;

    public Director() {
    }

    public Director(int codigo, String nombre, int codPais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codPais = codPais;
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

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }
}
