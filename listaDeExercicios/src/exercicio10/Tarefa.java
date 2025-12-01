package exercicio10;

public class Tarefa {
    private String descricao;
    private Prioridade prioridade;

    public Tarefa() {
    }

    public Tarefa(String descricao, Prioridade prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void exibirInformacoes() {
        System.out.printf("Descrição: " + this.descricao + "\nPrioridade: " + this.prioridade.name());
    }
}