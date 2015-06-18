
package BLL;

import java.util.Date;

public class Pelicula 
{
    private int codigo;
    private String nombre;
    private String sinopsis;
    private String censura;
    private Date fecProduccion;
    private Date fecEstreno;
    private String pagWeb;
    private String estado;
    private int codProductora;
    private int codGenero;
    private int codReparto;
    private int codPais;
    private int codCartelera;

    public Pelicula() {
    }

    public Pelicula(int codigo, String nombre, String sinopsis, String censura, Date fecProduccion, Date fecEstreno, String pagWeb, String estado, int codProductora, int codGenero, int codReparto, int codPais, int codCartelera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.censura = censura;
        this.fecProduccion = fecProduccion;
        this.fecEstreno = fecEstreno;
        this.pagWeb = pagWeb;
        this.estado = estado;
        this.codProductora = codProductora;
        this.codGenero = codGenero;
        this.codReparto = codReparto;
        this.codPais = codPais;
        this.codCartelera = codCartelera;
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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    public int getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
    }

    public int getCodReparto() {
        return codReparto;
    }

    public void setCodReparto(int codReparto) {
        this.codReparto = codReparto;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public int getCodCartelera() {
        return codCartelera;
    }

    public void setCodCartelera(int codCartelera) {
        this.codCartelera = codCartelera;
    }

    public Date getFecProduccion() {
        return fecProduccion;
    }

    public void setFecProduccion(Date fecProduccion) {
        this.fecProduccion = fecProduccion;
    }

    public Date getFecEstreno() {
        return fecEstreno;
    }

    public void setFecEstreno(Date fecEstreno) {
        this.fecEstreno = fecEstreno;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodProductora() {
        return codProductora;
    }

    public void setCodProductora(int codProductora) {
        this.codProductora = codProductora;
    }
}
