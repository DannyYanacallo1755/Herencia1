public class Menu {
    public static void main(String[] args) {
        Persona mipersona = new Persona(1755042213,
                "Hernandez",
                "Solozano",
                "Capricornio",
                "0994355087");
        Persona Pedro = new Persona();

        System.out.println(mipersona.getCI());
        System.out.println(Pedro.getCI());

        Estudiante Danny = new Estudiante(20221516,
                "Danny",
                "Yanacallo",
                "Pifo",
                "0959093619",
                1234,
                "Danny@",
                "Segundo",
                "Desarrollo de software");

        Estudiante David = new Estudiante();
        System.out.println("Nombre: " + Danny.getNombre());
        Danny.Estudiar();
        Danny.Memorizar();
        Danny.caminar();
        Danny.Trabajar();

        David.setNombre("David");
        System.out.println("Nombre: " + David.getNombre());
        David.Trabajar();
        David.caminar();
        David.Memorizar();
        David.Estudiar();

       Persona Ana=new Persona(1755042213,
               "Ana",
               "Fernandez",
               "Libra",
               "Doctora",
               "33 Años",
               "0987654321");
       System.out.println("");
       System.out.println(Ana.getNombre()+" es "+Ana.getCargo());
       System.out.println("Tiene "+Ana.getDireccion());
       System.out.println("Es de signo "+Ana.getSigno());
       System.out.println("Este es el metodo Examinar");
       System.out.println("");

       Persona Pablo=new Persona(123123212,
               "Pablo",
               "Lopez",
               "Cancer",
               "Empleado Publico",
               "Quito",
               "1234556");
       System.out.println(Pablo.getNombre()+" es "+Pablo.getCargo());
       System.out.println("Su telefono es "+Pablo.getTelefono());
       Pablo.Trabajar();
       System.out.println("");

       Persona Maritza=new Persona(12344342,
               "Maritza",
               "Perez",
               "Picis",
               "Estudiante",
               "Quito",
               "Tercer Semestre");
       System.out.println(Maritza.getNombre()+" es "+Maritza.getCargo());
       System.out.println("Esta en "+Maritza.getTelefono());
       Maritza.caminar();
       System.out.println("");


    }
}
