import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //!ArrayList
        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");

        //todo: IDEM Vector y LinkedList
        
         /*/Este llegó tarde */
         superHeroes.add("IronMan");

         if (superHeroes.contains("Spiderman")) {
             System.out.println("Spiderman ya está en la fiesta");
         }

         System.out.println("Hay un superhéroe que ya esta ebrio es: "+superHeroes.get(0));


         superHeroes.set(6, "Tony Stark"); 
         System.out.println("IronMan se quita el traje y muestra que en realidad es: "+superHeroes.get(6));
         //Este se fue temprano
         superHeroes.remove(3); //6
 
         if(!superHeroes.contains("Hulk")){
             System.out.println("Hulk no está en la fiesta");
         }
 
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
