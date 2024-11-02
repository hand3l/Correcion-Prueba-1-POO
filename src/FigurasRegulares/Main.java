package FigurasRegulares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancias
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();

        System.out.print("Ingrese el lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());

        System.out.print("Ingrese la base del rectángulo: ");
        rectangulo.setBase(scanner.nextDouble());

        System.out.print("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(scanner.nextDouble());

        System.out.print("Ingrese el radio del círculo: ");
        circulo.setRadio(scanner.nextDouble());

        System.out.print("Ingrese el lado1 del triángulo equilátero: ");
        triangulo.setLado1(scanner.nextDouble());


        // Imprimir
        System.out.println("\nDetalles de las figuras: ");
        cuadrado.Imprimir();
        rectangulo.Imprimir();
        circulo.Imprimir();
        triangulo.Imprimir();

        // Suma de todas las áreas
        double sumaAreas = cuadrado.Area() + rectangulo.Area() + circulo.Area() + triangulo.Area();

        System.out.println("\nLa suma de las áreas de las figuras es: " + sumaAreas);
        scanner.close();
    }
}



