// Exercício 10: Sistema de Gerenciamento de Projetos.

// Implemente um pequeno sistema em Java utilizando os conceitos de
// classes abstratas, herança, polimorfismo, enumeração e composição.

// • Classe abstrata MembroEquipe – Crie uma classe abstrata chamada
// MembroEquipe. Essa classe deve ter um atributo nome e um método
// abstrato trabalhar().

// Exercício de Aplicação Múltipla

// • Subclasses Programador e Designer:
// ✓Crie a classe Programador, que herda de MembroEquipe, e
// sobrescreve o método trabalhar(), exibindo uma mensagem
// relacionada a programação.
// ✓Crie a classe Designer, que também herda de MembroEquipe, e
// sobrescreve o método trabalhar(), exibindo uma mensagem
// relacionada a design.

// • Enumeração Prioridade – Crie uma enum chamada Prioridade com os
// valores: BAIXA, MEDIA, ALTA, URGENTE.

// Exercício de Aplicação Múltipla

// • Classe Tarefa – Crie uma classe Tarefa que tenha uma descrição e uma prioridade
// (usando a enum). Adicione um método para exibir as informações da tarefa.

// • Classe Projeto (composição) – Crie a classe Projeto que deve conter:
// ✓Uma lista de membros da equipe (MembroEquipe).
// ✓Uma lista de tarefas (Tarefa).
// ✓Implemente métodos para adicionar membros e tarefas.
// • Implemente um método exibirProjeto() que mostre:
// ✓O nome do projeto.
// ✓As mensagens de cada membro ao executar trabalhar().
// ✓A lista de tarefas com suas prioridades.

// Exercício de Aplicação Múltipla

// • Classe App (execução) – Na classe principal (App), crie um objeto
// Projeto. Adicione pelo menos dois programadores, um designer e três
// tarefas com diferentes prioridades. Por fim, exiba todas as
// informações do projeto chamando exibirProjeto().

package exercicio10;

public abstract class MembroEquipe {
    private String nome;


    public abstract void trabalhar();
}
