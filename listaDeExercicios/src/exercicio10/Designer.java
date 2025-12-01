package exercicio10;

public class Designer extends MembroEquipe {

    public Designer(String nome) {
        super(nome);
    }


    @Override
    public void trabalhar() {
        System.out.println("O Designer" + getNome() + " está criando protótipos");
    }
}
