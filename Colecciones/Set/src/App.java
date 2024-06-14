import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenidos a la fiesta de los superhéroes");

        //!HashSet
        // Set<String> superHeroes = new HashSet<>();
        // superHeroes.add("Spiderman");
        // superHeroes.add("Batman");
        // superHeroes.add("CatWoman");
        // superHeroes.add("Hulk");
        // superHeroes.add("Wonder Woman");
        // superHeroes.add("Superman");
        
        //!TreeSet (por defecto ordena alfabeticamente, pero se puede ordenar segun metodos)
        // Set<String> superHeroes = new TreeSet<>();
        // superHeroes.add("Spiderman");
        // superHeroes.add("Batman");
        // superHeroes.add("CatWoman");
        // superHeroes.add("Hulk");
        // superHeroes.add("Wonder Woman");
        // superHeroes.add("Superman");

        //!LinkedHashSet
        Set<String> superHeroes = new LinkedHashSet<>();
        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");
        
        /*/Este llegó tarde */
        superHeroes.add("IronMan");

        if (superHeroes.contains("Spiderman")) {
            System.out.println("Spiderman ya está en la fiesta");
        }

        //Este se fue temprano
        superHeroes.remove("Hulk"); //6

        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk no está en la fiesta");
        }

        //Como es muy rapido, se fue y volvio y ni cuenta nos dimos
        superHeroes.add("Superman"); //7?


        if(superHeroes.isEmpty()){
            System.out.println("La fiesta está vacía, ha terminado");
        }else{
            System.out.println("Quedan " + superHeroes.size() + " personajes en la fiesta");
        }

        System.out.println("**************************************************************");
        System.out.println("Estos son los superhéroes que están en la fiesta:");
        for (String superHero : superHeroes) {
            System.out.println(superHero);
        }
    }
}
