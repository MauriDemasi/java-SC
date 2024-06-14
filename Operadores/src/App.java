public class App {
    public static void main(String[] args) throws Exception {
        

        //Operadores: Simbolos que sirven para hacer operaciones matematicas con variables
        //o valores

        //Aritmeticos: +, -, *,/

        int a = 5;
        int b = 4;

        int c = a + b;
        System.err.println("suma: "+c);

        c = a - b;
        System.err.println("resta: "+c);

        c = a * b;
        System.err.println("producto: "+c);

        double aDouble = (double) a;
        double bDouble = (double) b; 
        double cDouble = (double) c;       
        cDouble = aDouble / bDouble;
        System.err.println("división: "+cDouble);

        /*Modulo 
         * El caso mas usado es para saber si un numero es par o impar
         * 
         * % -> modulo
        */

        a = 12 % 2;

        if (a==0) {
            System.out.println("es par");
        }
        else {
            System.out.println("es impar");
        }

        //Asignacion: =
        //Asignacion de suma: +=, -=, *=, /=
        //Asignacion de incremento: ++, --        
        //Comparacion: ==, !=, >, <, >=, <=
        //Logicos: &&, ||, !


    }
}
