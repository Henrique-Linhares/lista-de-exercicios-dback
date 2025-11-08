package exercicio03;

public class App {
    public static void main(String[] args) {
        Documento relatorioFinanceiro = new Documento("Relatório Financeiro", 50);
        Foto fotoCNH = new Foto("3x4", "Foto para CNH");

        System.out.println("Documento: " + relatorioFinanceiro.getNome());
        System.out.println("Número de páginas" + relatorioFinanceiro.getNumPaginas());

        System.out.println("");

        System.out.println("Foto: " + fotoCNH.getNomeFoto());
        System.out.println("Tamanho da foto" + fotoCNH.getTamanhoFoto());

        System.out.println("");

        Impressora impressora = new Impressora();
        impressora.imprimirItem(relatorioFinanceiro);
        impressora.imprimirItem(fotoCNH);
    }
}
