
package BLL;

public class Sala 
{
    private int codigo;
    private int codSucursal;
    private int numSala;
    private int codTipoSala;

    public Sala() {
    }

    public Sala(int codigo, int codSucursal, int numSala,int codTipoSala) {
        this.codigo = codigo;
        this.codSucursal = codSucursal;
        this.numSala = numSala;
        this.codTipoSala = codTipoSala;
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

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }
    
    public int getCodTipoSala() {
        return codTipoSala;
    }

    public void setCodTipoSala(int codTipoSala) {
        this.codTipoSala = codTipoSala;
    }
}
