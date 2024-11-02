package FigurasRegulares;

public class Circulo{
    private double radio;

    // Constructor sin parámetros
    public Circulo() {
        this.radio = 0;
    }

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double Area() {
        return Math.PI * Math.pow(radio, 2); // Corrección aquí
    }

    // Método para calcular el perímetro
    public double Perimetro() {
        return 2 * Math.PI * radio; // Corrección aquí
    }

    // Método para imprimir información
    public void Imprimir() {
        System.out.println("Círculo - Radio: " + radio);
        System.out.println("Área: " + Area());
        System.out.println("Perímetro: " + Perimetro());
    }
}

