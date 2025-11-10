package exercicio04;

public class Boleto implements Pagavel {
    private String codigoBarras;
    private double valor;

    public Boleto() {
    }

    public Boleto(String codigoBarras, double valor) {
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void pagar() {
        System.out.println("Valor a pagar: " + this.valor + " código de barras: " + this.codigoBarras);
        System.out.println("Boleto pago com sucesso.\n");
    }
}
