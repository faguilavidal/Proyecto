
package BLL;

public class Mercaderia
{
    private int codigo;
    private String nombre;
    private int cantidad;
    private int precio;
    private int codCompra;
    private int codTipoMercaderia;

    public Mercaderia() {
    }
    
    public Mercaderia(int codigo, String nombre, int cantidad, int precio, int codCompra, int codTipoMercaderia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codCompra = codCompra;
        this.codTipoMercaderia = codTipoMercaderia;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public int getCodTipoMercaderia() {
        return codTipoMercaderia;
    }

    public void setCodTipoMercaderia(int codTipoMercaderia) {
        this.codTipoMercaderia = codTipoMercaderia;
    }
}
