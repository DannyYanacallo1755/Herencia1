public class Futbolista extends Persona{
    private String Equipo;
    private String Posicion;
    private String nCamiseta;
    private String Representante;

    public Futbolista(int CI,
                      String nombre,
                      String apellido,
                      String direccion,
                      String telefono,
                      String equipo,
                      String posicion,
                      String nCamiseta,
                      String representante) {
        super(CI, nombre, apellido, direccion, telefono);
        this.Equipo = equipo;
        this.Posicion = posicion;
        this.nCamiseta = nCamiseta;
        this.Representante = representante;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    public String getnCamiseta() {
        return nCamiseta;
    }

    public void setnCamiseta(String nCamiseta) {
        this.nCamiseta = nCamiseta;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String representante) {
        Representante = representante;
    }
    public void Correr(){
        System.out.println("Este es el metodo correr");
    }
    public void CargoF(){
        System.out.println("Futbolista");
    }
}
