import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<FiguraGeometrica> registro = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al programa de cálculo de figuras geométricas!");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Esfera");
            System.out.println("5. Cubo");
            System.out.println("6. Pirámide");
            System.out.println("7. Imprimir registro");
            System.out.println("8. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarCirculo(scanner);
                    break;
                case 2:
                    ingresarCuadrado(scanner);
                    break;
                case 3:
                    ingresarTriangulo(scanner);
                    break;
                case 4:
                    ingresarEsfera(scanner);
                    break;
                case 5:
                    ingresarCubo(scanner);
                    break;
                case 6:
                    ingresarPiramide(scanner);
                    break;
                case 7:
                    imprimirRegistro();
                    break;
                case 8:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        scanner.close();
    }

    private static void ingresarCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(radio);
        registrarFigura(circulo);
        mostrarResultados(scanner, circulo);
    }

    private static void ingresarCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        registrarFigura(cuadrado);
        mostrarResultados(scanner, cuadrado);
    }

    private static void ingresarTriangulo(Scanner scanner) {
        System.out.print("Ingrese el lado 1 del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2 del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el lado 3 del triángulo: ");
        double lado3 = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, altura);
        registrarFigura(triangulo);
        mostrarResultados(scanner, triangulo);
    }

    private static void ingresarEsfera(Scanner scanner) {
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        Esfera esfera = new Esfera(radio);
        registrarFigura(esfera);
        mostrarResultados(scanner, esfera);
    }

    private static void ingresarCubo(Scanner scanner) {
        System.out.print("Ingrese el lado del cubo: ");
        double lado = scanner.nextDouble();
        Cubo cubo = new Cubo(lado);
        registrarFigura(cubo);
        mostrarResultados(scanner, cubo);
    }

    private static void ingresarPiramide(Scanner scanner) {
        System.out.print("Ingrese la base de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        Piramide piramide = new Piramide(base, altura);
        registrarFigura(piramide);
        mostrarResultados(scanner, piramide);
    }

    private static void registrarFigura(FiguraGeometrica figura) {
        registro.add(figura);
    }

    private static void mostrarResultados(Scanner scanner, FiguraGeometrica figura) {
        System.out.println("\n--- Resultados ---");
        System.out.println("Figura: " + figura.getNombre());

        System.out.println("Seleccione el cálculo a realizar:");
        System.out.println("1. Perímetro");
        System.out.println("2. Área");
        System.out.println("3. Volumen");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Perímetro: " + figura.calcularPerimetro());
                break;
            case 2:
                System.out.println("Área: " + figura.calcularArea());
                break;
            case 3:
                System.out.println("Volumen: " + figura.calcularVolumen());
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    private static void imprimirRegistro() {
        System.out.println("\n--- Registro de Figuras ---");
        if (registro.isEmpty()) {
            System.out.println("No se han registrado figuras.");
        } else {
            for (FiguraGeometrica figura : registro) {
                System.out.println("Figura: " + figura.getNombre());
                System.out.println("Perímetro: " + figura.calcularPerimetro());
                System.out.println("Área: " + figura.calcularArea());
                System.out.println("Volumen: " + figura.calcularVolumen());
                System.out.println();
            }
        }
    }
}