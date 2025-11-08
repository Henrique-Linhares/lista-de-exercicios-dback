package exercicio02;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        double areaCirculo = circulo.calcularArea();

        System.out.println("\nCírculo:");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.printf("Área Calculada: %.2f\n", areaCirculo);
        System.out.println("");

        Retangulo retangulo = new Retangulo(8.0, 4.0);
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("\nRetângulo:");
        System.out.printf("Base: " + retangulo.getBase() + " Altura: " + retangulo.getAltura());
        System.out.println("\nÁrea Calculada: \n" + areaRetangulo);

    }
}
