package exercicio01;

public class Gerente extends Funcionario {
    private String departamentoSupervisionado;
    private double participacaoLucros;

    // Construtor vazio
    public Gerente() {
    }

    // Construtor com parâmetros
    public Gerente(String departamentoSupervisionado, double participacaoLucros) {
        this.departamentoSupervisionado = departamentoSupervisionado;
        this.participacaoLucros = participacaoLucros;
    }

    // Construtor Com atributos da super
    public Gerente(String nome, double salario, String departamentoSupervisionado, double participacaoLucros) {
        super(nome, salario);
        this.departamentoSupervisionado = departamentoSupervisionado;
        this.participacaoLucros = participacaoLucros;
    }

    // Getters e Setters
    public String getDepartamentoSupervisionado() {
        return departamentoSupervisionado;
    }

    public void setDepartamentoSupervisionado(String departamentoSupervisionado) {
        this.departamentoSupervisionado = departamentoSupervisionado;
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    // Método sobrescrito da Funcionário
    @Override
    public double calcularBonus() {
        // 15%
        return getSalario() * 0.15;
    }

}
