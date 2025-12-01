package exercicio03;

public class Foto implements Imprimivel {
    private String nomeFoto;
    private String tamanhoFoto;

    public Foto() {
    }

    public Foto(String tamanhoFoto, String nomeFoto) {
        this.tamanhoFoto = tamanhoFoto;
        this.nomeFoto = nomeFoto;
    }

    public String getNomeFoto() {
        return nomeFoto;
    }

    public void setNomeFoto(String nomeFoto) {
        this.nomeFoto = nomeFoto;
    }

    public String getTamanhoFoto() {
        return tamanhoFoto;
    }

    public void setTamanhoFoto(String tamanhoFoto) {
        this.tamanhoFoto = tamanhoFoto;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome da Foto: " + nomeFoto + " no tamanho " + tamanhoFoto);
        System.out.println("Imprimindo...");
    }
}
