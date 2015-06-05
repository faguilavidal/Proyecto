package BLL;

/**
 *
 * @author Fabian Aguila
 */
public class Sucursal {
    private int codigo;
    private  int codMall;
    private int codComuna;
    private String direccion;

    public Sucursal() {
    }

    public Sucursal(int codigo, int codMall, int codComuna, String direccion) {
        this.codigo = codigo;
        this.codMall = codMall;
        this.codComuna = codComuna;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
