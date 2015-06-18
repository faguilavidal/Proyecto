package BLL;

import java.util.Date;

public class Compra 
{
    private int codigo;
    private int rutCliente;
    private Date fechaCompra;
    private int precioTotal;

    public Compra() {
    }

    public Compra(int codigo, int rutCliente, Date fechaCompra, int precioTotal) {
        this.codigo = codigo;
        this.rutCliente = rutCliente;
        this.fechaCompra = fechaCompra;
        this.precioTotal = precioTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
