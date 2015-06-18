
package BLL;

public class Actor 
{
    private int codigo;
    private String nombre;
    private int codPais;
    private int codTipoActor;

    public Actor() {
    }

    public Actor(int codigo, String nombre, int codPais, int codTipoActor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codPais = codPais;
        this.codTipoActor = codTipoActor;
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

    public int getCodTipoActor() {
        return codTipoActor;
    }

    public void setCodTipoActor(int codTipoActor) {
        this.codTipoActor = codTipoActor;
    }
}
