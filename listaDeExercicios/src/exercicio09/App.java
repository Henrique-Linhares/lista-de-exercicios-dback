package exercicio09;

public class App {
    public static void main(String[] args) {
        Computador desktop = new Computador(
                "Desktop Gamer",
                "Intel Core i9-14900K",
                "64GB DDR5 6400MHz");

        Computador laptop = new Computador(
                "Acer Nitro V15",
                "AMD Ryzen 5 8640HS",
                "16GB LPDDR5X 7500MHz");

        System.out.println(desktop);
        System.out.println();
        System.out.println(laptop);
    }
}