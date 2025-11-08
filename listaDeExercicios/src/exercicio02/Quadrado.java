package exercicio02;

public class Quadrado extends FormaGeométrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {}

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
