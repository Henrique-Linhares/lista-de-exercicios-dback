package exercicio02;

public class Circulo extends FormaGeométrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(Math.PI * raio, 2);
    }
}
