// Exercício 7: Crie uma enumeração chamada Moeda com os valores REAL,
// DOLAR, EURO. Cada constante deve conter o valor da taxa de câmbio em
// relação ao real. Implemente um método que converta um valor de uma
// moeda para reais, utilizando a taxa de câmbio associada.

package exercicio07;

public enum Moeda {
    REAL(1.0),
    DOLAR(5.31),
    EURO(6.14);

    private double taxaCambio;

    private Moeda() {}

    private Moeda(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }
    
    public double converteParaReal(double valor) {
        return valor * taxaCambio;
    }


    // Método de conversão
    public Double converteParaReal(Double valor) {
        return valor * taxaCambio;
    }
}
