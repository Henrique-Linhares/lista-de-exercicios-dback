package exercicio01;


public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Henrique", 5000.00, "Marketing", 0.05);
        double bonusGerente = gerente.calcularBonus();

        System.out.println("Funcionário: " + gerente.getNome());
        System.out.println("Salário Base: R$" + gerente.getSalario());
        System.out.println("Bônus Calculado (15%): " + bonusGerente);
        System.out.println("Salário Total: " +  (gerente.getSalario() + bonusGerente));
        System.out.println();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Kelly", 6500.00, "Back-end", "Pleno");
        double bonusDesenvolvedor = desenvolvedor.calcularBonus();

        System.out.println("Funcionário: " + desenvolvedor.getNome());
        System.out.println("Salário Base: " + desenvolvedor.getSalario());
        System.out.println("Bônus Calculado (10%):" + bonusDesenvolvedor);
        System.out.println("Salário Total: " + (desenvolvedor.getSalario() + bonusDesenvolvedor));
    }
}
