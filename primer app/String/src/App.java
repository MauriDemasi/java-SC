public class App {
    public static void main(String[] args) throws Exception {
        
        String texto = "   Estee es un texto asignado a un string   ";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println("La longitud del texto es: " + longitud);

        char caracter = texto.charAt(37);
        System.out.println("El primer caracter es: " + caracter);

        String subtexto = texto.substring(8, 19);
        System.out.println("El subtexto es: " + subtexto);

        String textoMayusculas = texto.toUpperCase();
        System.out.println("El texto en mayusculas es: " + textoMayusculas);

        String textoMinusculas = texto.toLowerCase();
        System.out.println("El texto en minusculas es: " + textoMinusculas);

        int indice = texto.indexOf("un");
        System.out.println("El indice del texto es: " + indice);

        String textoModificado = texto.replace("un", "dos");
        System.out.println("El texto modificado es: " + textoModificado);

        boolean isContain= texto.contains("grrg");
        System.out.println("El texto contiene un: " + isContain);
        
        String textoLimpio = texto.trim();
        System.out.println("El texto limpio es: " + textoLimpio);

    
    }
}
