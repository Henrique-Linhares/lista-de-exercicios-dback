// Exercício 6: Implemente uma enumeração chamada NivelPrioridade com os
// valores BAIXA, MEDIA, ALTA e URGENTE. Cada valor da enum deve ter um
// número associado que representa o nível de prioridade. Adicione um
// método getNivel() que retorne o número de prioridade. Instancie diferentes
// níveis e exiba suas prioridades.

package exercicio06;

public enum NivelPrioridade {
    BAIXA(1),
    MEDIA(2),
    ALTA(3),
    URGENTE(4);

    private int nivel;

    private NivelPrioridade() {
    }

    private NivelPrioridade(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
