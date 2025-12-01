package exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nomeProjeto;
    private List<MembroEquipe> membros; 
    
    private List<Tarefa> tarefas;

    public Projeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
        this.membros = new ArrayList<>(); 
        this.tarefas = new ArrayList<>();
    }

    public void adicionarMembro(MembroEquipe membro) {
        this.membros.add(membro);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void exibirProjeto() {
        System.out.println("PROJETO: " + this.nomeProjeto);
                System.out.println("\n[ 1. Status da Equipe ]");
        for (MembroEquipe membro : membros) {
            membro.trabalhar(); 
        }

        System.out.println("\n[ 2. Tarefas Pendentes ]");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                tarefa.exibirInformacoes();
            }
        }
    }
}
