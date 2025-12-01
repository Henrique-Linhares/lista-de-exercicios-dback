package exercicio09;

public class Memoria {
    private String armazenamento;

    public Memoria() {
    }

    public Memoria(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [armazenamento=" + armazenamento + "]";
    }

    
}