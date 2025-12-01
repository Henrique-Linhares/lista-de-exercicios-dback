//Exercício 1: Crie uma classe abstrata chamada Funcionario que possua os
//seguintes atributos: nome, salario. Defina um método abstrato
//calcularBonus(). Crie classes concretas Gerente e Desenvolvedor, que
//estendem Funcionario, e implementam o cálculo do bônus de forma
//diferente. Instancie objetos dessas classes e calcule o bônus para cada tipo
//de funcionário.

package exercicio01;

public abstract class Funcionario {
    private String nome;
    private double salario;

    // Construtor vazio
    public Funcionario() {
    }

    // Construtor com parâmetros
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método de calcular o bônus
    public abstract double calcularBonus();
}
