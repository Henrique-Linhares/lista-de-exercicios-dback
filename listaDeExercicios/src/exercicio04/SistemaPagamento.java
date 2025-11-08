package exercicio04;

public class SistemaPagamento {

    public void processarPagamento(Pagavel pagamento) {
        System.out.println("\n--- Iniciando Transação ---");
        pagamento.pagar(); 
        System.out.println("Efetuando pagamento...");
        System.out.println("Transação Finalizada com Sucesso!\n");
    }
}

