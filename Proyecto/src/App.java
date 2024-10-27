import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("---------------Figuras geométricas---------------");
            System.out.println("");
            System.out.println("               1) Círculo                ");
            System.out.println("               2) Cuadrado               ");
            System.out.println("               3) Triángulo              ");
            System.out.println("               4) Salir                  ");
            System.out.println("");
            System.out.println("-------------------------------------------------");

            System.out.print("Introduce una opción: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("-------------------------------------------------");
                    System.out.println("               Círculo                ");
                    System.out.println("-------------------------------------------------");

                    System.out.print("Introduce el radio del círculo: ");
                    double radio = input.nextDouble();

                    System.out.print("Introduce el color del círculo: ");
                    String colorCirculo = input.next();

                    System.out.print("¿Está relleno? (true/false): ");
                    boolean rellenoCirculo = input.nextBoolean();

                    Circulo circulo = new Circulo(radio, colorCirculo, rellenoCirculo);

                    // Mostrar los datos del círculo
                    System.out.println("Área: " + circulo.getArea());
                    System.out.println("Perímetro: " + circulo.getPerimetro());
                    System.out.println("Color: " + circulo.color);
                    System.out.println("¿Relleno?: " + rellenoCirculo);
                    break;

                case 2:
                    System.out.println("-------------------------------------------------");
                    System.out.println("               Cuadrado                ");
                    System.out.println("-------------------------------------------------");

                    System.out.print("Introduce la base del cuadrado: ");
                    double baseCuadrado = input.nextDouble();

                    System.out.print("Introduce la altura del cuadrado: ");
                    double alturaCuadrado = input.nextDouble();

                    System.out.print("Introduce el color del cuadrado: ");
                    String colorCuadrado = input.next();

                    System.out.print("¿Está relleno? (true/false): ");
                    boolean rellenoCuadrado = input.nextBoolean();

                    Cuadrado cuadrado = new Cuadrado(baseCuadrado, alturaCuadrado, colorCuadrado, rellenoCuadrado);

                    System.out.println("Área: " + cuadrado.getArea());
                    System.out.println("Perímetro: " + cuadrado.getPerimetro());
                    System.out.println("Color: " + cuadrado.color);
                    System.out.println("¿Relleno?: " + rellenoCuadrado);
                    break;

                case 3:
                    System.out.println("-------------------------------------------------");
                    System.out.println("               Triángulo               ");
                    System.out.println("-------------------------------------------------");

                    System.out.print("Introduce el lado 1 del triángulo: ");
                    double lado1 = input.nextDouble();

                    System.out.print("Introduce el lado 2 del triángulo: ");
                    double lado2 = input.nextDouble();

                    System.out.print("Introduce el lado 3 del triángulo: ");
                    double lado3 = input.nextDouble();

                    System.out.print("Introduce el color del triángulo: ");
                    String colorTriangulo = input.next();

                    System.out.print("¿Está relleno? (true/false): ");
                    boolean rellenoTriangulo = input.nextBoolean();

                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3, colorTriangulo, rellenoTriangulo);

                    // Mostrar los datos del triángulo
                    System.out.println("Área: " + triangulo.getArea());
                    System.out.println("Perímetro: " + triangulo.getPerimetro());
                    System.out.println("Color: " + triangulo.color);
                    System.out.println("¿Relleno?: " + rellenoTriangulo);
                    break;

                case 4:
                    System.out.println("Saliendo, hasta luego!");
                    break;

                default:
                    System.out.println("Introduzca una opción válida.");
                    break;
            }
        } while (option != 4);

        input.close();
    }
}
