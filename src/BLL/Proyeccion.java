
package BLL;

public class Proyeccion 
{
    private int codigo;
    private int codSala;
    private int codPelicula;
    private int horaInicio;
    private int horaTermino;

    public Proyeccion() {
    }

    public Proyeccion(int codigo, int codSala, int codPelicula, int horaInicio, int horaTermino) {
        this.codigo = codigo;
        this.codSala = codSala;
        this.codPelicula = codPelicula;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
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

    public int getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(int codPelicula) {
        this.codPelicula = codPelicula;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(int horaTermino) {
        this.horaTermino = horaTermino;
    }
}
