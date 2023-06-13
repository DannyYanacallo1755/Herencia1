public class EmpleadoPublico extends Persona{
    private  int Codigo;
    private String Cargo;
    private String Puesto;

    public EmpleadoPublico(int CI,
                           String nombre,
                           String apellido,
                           String direccion,
                           String telefono,
                           int Codigo,
                           String cargo,
                           String puesto) {
        super(CI, nombre, apellido, direccion, telefono);
        this.Codigo = Codigo;
        this.Cargo = cargo;
        this.Puesto = puesto;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }
    public void Trabajar(){
        System.out.println("Este es el metodo trabajar");
    }
    public void Cargo(){
        System.out.println("Empleado");
    }
}
