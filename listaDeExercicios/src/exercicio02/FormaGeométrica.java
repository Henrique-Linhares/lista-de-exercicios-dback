//Exercício 2: Implemente uma classe abstrata chamada FormaGeometrica,
//que contenha o método abstrato calcularArea(). Crie classes concretas
//Circulo e Retangulo, que herdem de FormaGeometrica e implementem o
//cálculo da área. Teste o comportamento calculando as áreas de diferentes
//formas geométricas.

package exercicio02;

public abstract class FormaGeométrica {

    //Método para calcular a área
    public abstract double calcularArea();
}
