package BLL;

/**
 *
 * @author Fabian Aguila
 */
public class Usuario {
    private String usuario;
    private String contraseña;
    private int rut;
    private String nombre;
    private String email;
    private int estadoEmail;
    private int estadousuario;
    private  int idTipoUsuario;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, int rut, String nombre, String email, int estadoEmail, int estadousuario, int idTipoUsuario) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.estadoEmail = estadoEmail;
        this.estadousuario = estadousuario;
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstadoEmail() {
        return estadoEmail;
    }

    public void setEstadoEmail(int estadoEmail) {
        this.estadoEmail = estadoEmail;
    }

    public int getEstadousuario() {
        return estadousuario;
    }

    public void setEstadousuario(int estadousuario) {
        this.estadousuario = estadousuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    
    public Usuario buscarUserUsuario(String usuario){
        return new DAL.UsuarioDAL().buscarUserUsuario(usuario);
    }
    
    public Usuario buscarUserEmail(String email){
        return new DAL.UsuarioDAL().buscarUserEmail(email);
    }
    
    public int registrarUsuarioBLL(String usuario,String contraseña,int rut, String nombre,String email){
        Usuario u = new Usuario(usuario,contraseña,rut,nombre,email,0,0,0);
        return new DAL.UsuarioDAL().insertUser(u);
    }
    
}
