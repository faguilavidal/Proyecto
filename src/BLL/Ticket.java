
package BLL;

public class Ticket 
{
    private int codigo;
    private int codProyeccion;
    private int codCompra;

    public Ticket() {
    }
    
    public Ticket(int codigo, int codProyeccion, int codCompra) {
        this.codigo = codigo;
        this.codProyeccion = codProyeccion;
        this.codCompra = codCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodProyeccion() {
        return codProyeccion;
    }

    public void setCodProyeccion(int codProyeccion) {
        this.codProyeccion = codProyeccion;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }
}
