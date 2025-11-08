package exercicio03;

public class Impressora {

    public void imprimirItem(Imprimivel item) {
        System.out.println("--- Impressora HP ---\n");
        item.imprimir();
        System.out.println("--- Impressão Feita com Sucesso ---\n");
    }
}
