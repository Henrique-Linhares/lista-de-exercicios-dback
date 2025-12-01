package exercicio10;

public class Programador extends MembroEquipe{
    private String nivel;

    public Programador(String nome, String nivel) {
        super(nome);
        this.nivel = nivel;
    }

    public Programador(String nome) {
        super(nome);
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

     @Override
    public void trabalhar() {
        System.out.println("O programador" + getNome() + "de nível" + getNivel() + " está programando e corrigindo bugs.");
    }
}
