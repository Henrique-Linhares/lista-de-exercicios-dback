// Crie uma classe Computador que tenha uma composição
// com as classes Processador e Memoria. A classe Processador deve ter o
// atributo modelo, e a classe Memoria deve ter o atributo capacidade. A
// classe Computador deve permitir exibir as informações de seu
// processador e memória. Instancie um Computador com diferentes
// componentes e exiba seus detalhes.

package exercicio09;

public class Computador {
    private Processador processador;
    private Memoria memoria;
    private String nome;

    public Computador() {
    }

    public Computador(String nome, String modeloProcessador, String armazenamentoMemoria) {
        this.nome = nome;
        this.processador = new Processador(modeloProcessador);
        this.memoria = new Memoria(armazenamentoMemoria);
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Detalhes do Computador: " + this.nome + "\n" +
                "Processador: " + this.processador.getModelo() + "\n" +
                "Memória: " + this.memoria.getArmazenamento();
    }

}