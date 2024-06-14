import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que bebida desea?");
        System.out.println("Elegi la opcion correspondiente a tu bebida");
        System.out.println("1 - Cafe");
        System.out.println("2 - Mate");
        System.out.println("3 - Agua");
        System.out.println("4 - Coca");
        System.out.println("5 - Vino");
        int opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                System.out.println("Cafe");
                break;
            case 2:
                System.out.println("Mate");
                break;
            case 3:
                System.out.println("Agua");
                break;
            case 4:
                System.out.println("Coca");
                break;
            case 5:
                System.out.println("Vino");
                break;
            default:
                System.out.println("Bebida no encontrada");
        } 

        if (opcion <= 5) {
            System.out.println("Disfrute su bebida");
        }
        scanner.close();
        }

    }

