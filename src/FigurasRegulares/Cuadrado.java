package FigurasRegulares;

public class Cuadrado {
    private double lado;

    //Construtor sin parametros
    public Cuadrado() {
        lado = 0;
    }

    //Constructor con parametros
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Getters y Setters
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    //Metodo perzonalizado
    public double Area (){
        return lado * lado;
    }

    public double Perimetro(){
        return lado * 4;
    }

    public void Imprimir(){
        System.out.println("Cuadrado - Lado: " + lado );
        System.out.println("Area: " + Area());
        System.out.println("Perimetro: " + Perimetro());
    }
}
