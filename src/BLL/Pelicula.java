
package BLL;

import java.util.Date;

public class Pelicula 
{
    private int codigo;
    private String nombre;
    private String sinopsis;
    private int censura;
    private String fecProduccion;
    private String fecEstreno;
    private String pagWeb;
    private int estado;
    private int codProductora;
    private int codGenero;
    private int codPais;

    public Pelicula() {
    }

    public Pelicula(int codigo, String nombre, String sinopsis, int censura, String fecProduccion, String fecEstreno, String pagWeb, int estado, int codProductora, int codGenero, int codPais) {
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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getCensura() {
        return censura;
    }

    public void setCensura(int censura) {
        this.censura = censura;
    }

    public int getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public String getFecProduccion() {
        return fecProduccion;
    }

    public void setFecProduccion(String fecProduccion) {
        this.fecProduccion = fecProduccion;
    }

    public String getFecEstreno() {
        return fecEstreno;
    }

    public void setFecEstreno(String fecEstreno) {
        this.fecEstreno = fecEstreno;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodProductora() {
        return codProductora;
    }

    public void setCodProductora(int codProductora) {
        this.codProductora = codProductora;
    }
    
    public int registroMaxPelicula(){
        return new DAL.PeliculaDAL().maxPelicula();
    }
    
    public int AgregarPelicula(
            int codigo, String nombre, String sinopsis,
            int censura, String fecProduccion, String fecEstreno,
            String pagWeb, int estado, String codProductora,
            String codGenero, String codPais){
        Pelicula p = new Pelicula
        (
                codigo,
                nombre,
                sinopsis,
                censura,
                fecProduccion,
                fecEstreno,
                pagWeb,
                estado, 
                new DAL.ProductoraDAL().idProductora(codProductora), 
                new DAL.GeneroDAL().idGenero(codGenero),
                new DAL.PaisDAL().idPais(codPais)
        );
        int resultado = new DAL.PeliculaDAL().InsertarPelicula(p);
        return resultado;
    }

    public int eliminarPelicula(int codigo){
        return new DAL.PeliculaDAL().deletePelicula(codigo);
    }
    
    public int ActualizarPelicula(
            int codigo, String nombre, String sinopsis,
            int censura, String fecProduccion, String fecEstreno,
            String pagWeb, int estado, String codProductora,
            String codGenero, String codPais){
        Pelicula p = new Pelicula
        (
                codigo,
                nombre,
                sinopsis,
                censura,
                fecProduccion,
                fecEstreno,
                pagWeb,
                estado, 
                new DAL.ProductoraDAL().idProductora(codProductora), 
                new DAL.GeneroDAL().idGenero(codGenero),
                new DAL.PaisDAL().idPais(codPais)
        );
        int resultado = new DAL.PeliculaDAL().UpdatePelicula(p);
        return resultado;
    }
    
    public Pelicula buscarPelicula(int pelicula){
        return new DAL.PeliculaDAL().buscarPelicula(pelicula);
    }
}
