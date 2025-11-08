//Exercício 4: Implemente uma interface chamada Pagavel com um método
//        pagar(). Crie classes Boleto e CartaoCredito que implementem Pagavel de
//maneiras diferentes (por exemplo, o boleto pode ser pago por código de
//        barras, e o cartão de crédito por número de cartão). Implemente uma classe
//SistemaPagamento que aceite objetos do tipo Boleto e CartaoCredito e
//chame o método pagar() para processar os pagamentos.

package exercicio04;

public interface Pagavel {

    void pagar();
}
