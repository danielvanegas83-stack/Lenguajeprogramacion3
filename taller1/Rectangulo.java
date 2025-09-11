package taller1;
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double Area() {
        return base * altura;
    }

    public double Perimetro() {
        return 2 * (base + altura);
    }
}
