package BLL;

/**
 *
 * @author Fabian Aguila
 */
public class Usuario {
    private int rut;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String email;
    private int idTipoUsuario;
    private int idSucursal;

    public Usuario() {
    }

    public Usuario(int rut, String contraseña, String nombre, String apellido, String email, int idTipoUsuario, int idSucursal) {
        this.rut = rut;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.idTipoUsuario = idTipoUsuario;
        this.idSucursal = idSucursal;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    public Usuario buscarUserUsuario(int usuario){
        return new DAL.UsuarioDAL().buscarUserUsuario(usuario);
    }
    
    public Usuario buscarUserEmail(String email){
        return new DAL.UsuarioDAL().buscarUserEmail(email);
    }
    
    public int registrarUsuarioBLL(int rut, String contraseña, String nombre, String apellido, String email, String Sucursal){
        Usuario u = new Usuario(rut, contraseña, nombre, apellido, email, 0, new Sucursal().obtenerIdSucursal(Sucursal));
        return new DAL.UsuarioDAL().insertUser(u);
    }
    
}
