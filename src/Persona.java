public class Persona {

    private  int CI;
    private String Nombre;
    private String Apellido;
    private String Signo;
    private String Cargo;
    private String Direccion;
    private String Telefono;
    public Persona(){
    super();
    }
    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String signo) {
        Signo = signo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public Persona(int CI, String nombre, String apellido, String signo, String cargo, String direccion, String telefono) {
        this.CI = CI;
        Nombre = nombre;
        Apellido = apellido;
        Signo = signo;
        Cargo = cargo;
        Direccion = direccion;
        Telefono = telefono;
    }

    public Persona(int CI, String nombre, String apellido, String direccion, String telefono) {
        this.CI = CI;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Direccion = direccion;
        this.Telefono = telefono;
    }
    public void caminar(){
        System.out.println("Este es el metodo caminar");
    }
    public void Trabajar(){
        System.out.println("Este es el metodo Trabajar");
    }

}
