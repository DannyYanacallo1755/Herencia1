public class Doctor extends Persona {
    private  int CI;
    private String Nombre;
    private String Apellido;
    private String Signo;
    private String Cargo;
    private String Direccion;
    private String Telefono;
    private  int Codigo;
    private String Especialidad;
    private String Horario;
    private String Hospital;

    public Doctor(int CI,
                  String nombre,
                  String apellido,
                  String direccion,
                  String telefono,
                  int codigo,
                  String especialidad,
                  String horario,
                  String hospital) {
        super(CI, nombre, apellido, direccion, telefono);
        this.Codigo = codigo;
        this.Especialidad = especialidad;
        this.Horario = horario;
        this.Hospital = hospital;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String hospital) {
        Hospital = hospital;
    }
    public void Tratar(){
        System.out.println("Este es el metodo tratar");
    }
    public void Examinar(){
        System.out.println("Este es el metodo tratar");
    }
    public void CargoD(){
        System.out.println("Doctor");
    }
}
