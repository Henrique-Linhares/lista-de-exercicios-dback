package exercicio04;

public class App {
    public static void main(String[] args) {
        Boleto boletoLuz = new Boleto("12334455 76743674 4343 348347", 150.00);
        CartaoDeCredito compraOnline = new CartaoDeCredito("1234", 89.99);
        SistemaPagamento sistema = new SistemaPagamento();

        System.out.println("\nPagamento via Boleto: ");
        sistema.processarPagamento(boletoLuz);

        System.out.println("\nPagamento via cartão de crédito: ");
        sistema.processarPagamento(compraOnline);

    }
}
