import Exceptions.CalculateExceptions;

public class App {
    public static void main(String[] args) throws Exception {

        // Excepciones: eventos que interrumpen el flujo normal de la aplicacion:

        // Checked Exception: La aplicacion maneja esta excepcion


        int numero1 = 50;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);

        } catch (CalculateExceptions e) {
            e.printStackTrace();
            //Y esto si se imprime
            System.out.println("Esto va despues de la excepcion");
        } finally {
            System.out.println("Hemos finalizado el calculo sea exitoso o no");
        }

    }

}
