public class Estudiante extends Persona{
    private int codigo;
    private String Correo;
    private String Semestre;
    private String Carrera;
    public Estudiante() {
        super();
    }


    public Estudiante(int CI,
                      String nombre,
                      String apellido,
                      String direccion,
                      String telefono,
                      int codigo,
                      String correo,
                      String semestre,
                      String carrera) {
        super(CI, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase estudiante
        this.codigo = codigo;
        this.Correo = correo;
        this.Semestre = semestre;
        this.Carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
    public void Estudiar(){
        System.out.println("Este es el metodo estudiar");
    }
    public void Memorizar(){
        System.out.println("Este es el metodo memorizar");
    }
    public void leer(){
        System.out.println("Este es el metodo leer");
    }
}
