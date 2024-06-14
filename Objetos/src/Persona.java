public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;


    //Constructor

    public Persona(String nombre, String apellido, int edad){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;; 

    }

    //Metodos
    public String mostrarNombreCompleto(){
        return "Nombre: " + nombre + " Apellido: " + apellido ;
    } 

    public String saludo(String nombre){
        if (edad>40) return "Hola soy " +this.nombre + " y lo saludo " + nombre;
        return "Hola soy " +this.nombre + " y te saludo " + nombre;

    }


    //Getters y Setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

}
