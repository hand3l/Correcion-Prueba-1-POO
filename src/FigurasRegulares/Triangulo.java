package FigurasRegulares;

public class Triangulo {
    private double lado1;

    // Constructor sin parámetros
    public Triangulo() {
        lado1 = 0;
    }

    // Constructor con parámetros
    public Triangulo(double lado) {
        this.lado1 = lado;
    }

    // Getter y Setter
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado) {
        this.lado1 = lado;
    }

    // Metodo para calcular el área (triángulo rectángulo)
    public double Area() {
        return (lado1 * lado1) / 2; // Área = (base * altura) / 2
    }

    // Metodo para calcular el perímetro
    public double Perimetro() {
        return lado1 * 3; // Asumiendo que todos los lados son iguales en un triángulo equilátero
    }

    public void Imprimir() {
        System.out.println("Triángulo - Lado: " + lado1);
        System.out.println("Área: " + Area());
        System.out.println("Perímetro: " + Perimetro());
    }
}

