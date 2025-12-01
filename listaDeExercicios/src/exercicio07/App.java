package exercicio07;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moedas disponíveis para conversão:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Rea");
        System.out.print("Escolha a moeda: ");

        try {
            int opcao = scan.nextInt();

            System.out.println("Digite o valor que deseja converter para Real: ");
            double valor = scan.nextDouble();

            Moeda moedaOrigem = null;

            if (opcao == 1) {
                moedaOrigem = Moeda.DOLAR;
            } else if (opcao == 2) {
                moedaOrigem = Moeda.EURO;
            } else if (opcao == 3) {
                moedaOrigem = Moeda.REAL;
            } else {
                System.out.println("Moeda inválida");
                return;
            }

            double valorEmReal = moedaOrigem.converteParaReal(valor);

            String nomeMoeda = moedaOrigem.name();

            System.out.println("A taxa de câmbio de: " + nomeMoeda + " é de: " + moedaOrigem.getTaxaCambio());
            System.out.println("Valor da moeda " + nomeMoeda + " é de: " + valor);
            System.out.println("O valor convertido de real para " + nomeMoeda + " é de: " + Math.round(valorEmReal));
            System.out.println("-----------------------------");

        } catch (Exception e) {
            System.out.println("\nErro! tente novamente!");
        } finally {
            scan.close();
        }
    }
}