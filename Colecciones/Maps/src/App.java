import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************");
        System.out.println("* Bienvenidos a nuestra verduleria *");
        System.out.println("************************************");


        //! HashMap (no respeta ningun tipo de orden)
        // Map <String, Double> inventario = new HashMap<>();
        // inventario.put("Banana", 1.89);
        // inventario.put("Tomate", 0.75);
        // inventario.put("Palta", 0.95);
        // inventario.put("Frutilla" , 0.65);
        // inventario.put("Pimiento", 0.77);

        //! LinkedHashMap (respeta el orden de insercion)
        // Map <String, Double> inventario = new LinkedHashMap<>();
        // inventario.put("Banana", 1.89);
        // inventario.put("Tomate", 0.75);
        // inventario.put("Palta", 0.95);
        // inventario.put("Frutilla", 0.65);
        // inventario.put("Pimiento", 0.77);

        //! TreeMap (respeta el orden natural de las claves)
        Map <String, Double> inventario = new TreeMap<>();
        inventario.put("Banana", 1.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Palta", 0.95);
        inventario.put("Frutilla" , 0.65);
        inventario.put("Pimiento", 0.77);


        
        
        System.out.println("Este es el inventario de frutas y verduras");

        //el metodo keyset, devuelve un arreglo con todas las keys (claves)
        for (String fruta : inventario.keySet()) {
            //Si al metodo get le pasamos cada fruta(key) que va obteniendo, nos devuelve el valor 
            System.out.println(fruta + ": $" + inventario.get(fruta));
        } 
        System.out.println("La cantidad de productos en la verduleria es de: " + inventario.size());


        String frutaBuscada="Pimiento";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: "+frutaBuscada);

        if(inventario.containsKey(frutaBuscada)){
            System.out.println("La fruta "+frutaBuscada+" si se encuentra en el inventario, y cuesta: $"+inventario.get(frutaBuscada));
        }else{
            System.out.println("Lo siento, la fruta "+frutaBuscada+" no se encuentra en el inventario");
        }

        String sinStock= frutaBuscada;
        if(inventario.containsKey(sinStock)){
            inventario.remove(sinStock);
            System.out.println("Se ha eliminado del inventario la fruta "+sinStock);
        }else{
            return;
        }

        System.out.println("Este es el nuevo inventario de frutas y verduras");
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }
        System.out.println("La cantidad de productos en la verduleria es de: " + inventario.size());

    }
}
