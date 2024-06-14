public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Pedro", "Pascal", 52);

        persona1.setNombre ("Elon");
        persona1.setApellido("Musk");


        System.out.println("El es: "+persona1.mostrarNombreCompleto()
        + " y tiene: " + persona1.getEdad() + " años" );

        System.out.println(persona1.saludo("Mauri"));   


    }
}
