package exercicio01;

public class Desenvolvedor extends Funcionario {
    private String especializacao;
    private String nivelExeperiencia;

    // Construtor vazio
    public Desenvolvedor() {
    }

    // Construtor com parâmetros
    public Desenvolvedor(String especializacao, String nivelExeperiencia) {
        this.especializacao = especializacao;
        this.nivelExeperiencia = nivelExeperiencia;
    }

    // Construtor com atributos da super
    public Desenvolvedor(String nome, double salario, String especializacao, String nivelExeperiencia) {
        super(nome, salario);
        this.especializacao = especializacao;
        this.nivelExeperiencia = nivelExeperiencia;
    }

    // Getters e Setters
    public String getEspecializacao() {
        return especializacao;
    }

    public String getNivelExeperiencia() {
        return nivelExeperiencia;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void setNivelExeperiencia(String nivelExeperiencia) {
        this.nivelExeperiencia = nivelExeperiencia;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10 + 500;
    }
}
