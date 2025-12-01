package exercicio06;

public class App {
    public static void main(String[] args) {
        System.out.println("Prioridades das tarefas: ");

        for (NivelPrioridade nivel : NivelPrioridade.values()) {
            System.out.println(nivel.name() + ": " + nivel.getNivel());
        }
    }
}
