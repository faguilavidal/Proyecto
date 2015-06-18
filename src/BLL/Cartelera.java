
package BLL;

public class Cartelera 
{
    private int codigo;
    private int codSucursal;

    public Cartelera() {
    }
    
    public Cartelera(int codigo, int codSucursal) {
        this.codigo = codigo;
        this.codSucursal = codSucursal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(int codSucursal) {
        this.codSucursal = codSucursal;
    }
}
