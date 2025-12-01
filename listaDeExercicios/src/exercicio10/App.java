package exercicio10;

public class App {
    public static void main(String[] args) {
        Projeto projetoWeb = new Projeto("Plataforma de E-commerce v2.0");

        projetoWeb.adicionarMembro(new Programador("João Dev"));
        projetoWeb.adicionarMembro(new Programador("Maria Fullstack"));

        projetoWeb.adicionarMembro(new Designer("Pedro UX"));

        projetoWeb.adicionarTarefa(new Tarefa("Corrigir falha crítica no checkout.", Prioridade.URGENTE));
        projetoWeb.adicionarTarefa(new Tarefa("Desenvolver nova API para produtos.", Prioridade.ALTA));

        projetoWeb.adicionarTarefa(new Tarefa("Criar mockups para nova página inicial.", Prioridade.MEDIA));

        projetoWeb.adicionarTarefa(new Tarefa("Revisar documentação técnica.", Prioridade.BAIXA));

        projetoWeb.exibirProjeto();
    }
}
