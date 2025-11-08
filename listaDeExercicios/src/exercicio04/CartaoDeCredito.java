package exercicio04;

public class CartaoDeCredito implements Pagavel{
    private String numeroCartao;
    private double valor;
    
    public CartaoDeCredito() {}

    public CartaoDeCredito(String numeroCartao, double valor) {
        this.numeroCartao = numeroCartao;
        this.valor = valor;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void pagar() {
        System.out.println("Valor a pagar: " + this.valor + " Cartão: " + this.numeroCartao);
        System.out.println("Transação autorizada com sucesso!\n");
    }
}
