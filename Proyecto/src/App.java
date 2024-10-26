import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("---------------Figuras geometricas---------------");
        System.out.println("");
        System.out.println("               1) Circulo                ");
        System.out.println("               2) Cuadrado                ");
        System.out.println("               3) Triangulo                ");
        System.out.println("               4) Salir                ");
        System.out.println("");
        System.out.println("-------------------------------------------------");

        System.out.println("Introduce una opcion: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("-------------------------------------------------");
                System.out.println("               Circulo                ");
                System.out.println("-------------------------------------------------");
                break;

            case 2:
                System.out.println("-------------------------------------------------");
                System.out.println("               Cuadrado                ");    
                System.out.println("-------------------------------------------------");
                break;
                
            case 3:
                System.out.println("-------------------------------------------------");
                System.out.println("               Triangulo                ");    
                System.out.println("-------------------------------------------------");
                break;

            case 4:System.out.println("Saliendo, hasta luego!");break;
        
            default:
                System.out.println("Introduzca una opcion valida");
                break;
        }

    }
}
