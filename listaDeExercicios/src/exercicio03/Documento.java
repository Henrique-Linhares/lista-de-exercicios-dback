package exercicio03;

public class Documento implements Imprimivel {
    private String nome;
    private int numPaginas;

    public Documento() {
    }

    public Documento(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome + "(Número de Páginas: " + numPaginas + ")");
        System.out.println("Imprimindo...");
    }
}
