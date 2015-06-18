
package BLL;

public class Asiento 
{
    private int codigo;
    private int codSala;
    private int numero;

    public Asiento() {
    }

    public Asiento(int codigo, int codSala, int numero) {
        this.codigo = codigo;
        this.codSala = codSala;
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodSala() {
        return codSala;
    }

    public void setCodSala(int codSala) {
        this.codSala = codSala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
