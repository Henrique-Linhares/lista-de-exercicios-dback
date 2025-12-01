package exercicio10;

public class App {
    public static void main(String[] args) {
        Projeto projetoWeb = new Projeto("Plataforma de E-commerce v2.0");

        projetoWeb.adicionarMembro(new Programador("Henrique", "Junior"));
        projetoWeb.adicionarMembro(new Programador("Kelly", "Pleno"));

        projetoWeb.adicionarMembro(new Designer("Pedro"));

        projetoWeb.adicionarTarefa(new Tarefa("Corrigir falha no banco de dados.", Prioridade.URGENTE));
        projetoWeb.adicionarTarefa(
                new Tarefa("Desenvolver uma nova API com Spring Boot para produtos.", Prioridade.ALTA));

        projetoWeb.adicionarTarefa(new Tarefa("Criar prototipo para a página de login", Prioridade.MEDIA));

        projetoWeb.adicionarTarefa(new Tarefa("Revisar uml de classes.", Prioridade.BAIXA));

        projetoWeb.exibirProjeto();
    }
}
