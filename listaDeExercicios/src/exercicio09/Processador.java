package exercicio09;

public class Processador {
    private String modelo; 


    public Processador() {
    }

    public Processador(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Processador [modelo=" + modelo + "]";
    }

}