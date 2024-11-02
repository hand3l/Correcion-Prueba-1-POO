package FigurasRegulares;

public class Rectangulo {
    private double base;
    private double altura;

    //Constructor sin parametros
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    //Constructor con parametros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos perzonalizados
    public double Area (){
        return base * altura;
    }

    public double Perimetro(){
        return 2 * (base + altura);
    }


    public void Imprimir() {
        System.out.println("Rectangulo - Ancho: " + base + ", Altura: " + altura);
        System.out.println("Area: " + Area());
        System.out.println("Perimetro: " + Perimetro());
    }
}

