package exercicio05;

public class App {
    public static void main(String[] args) {

        System.out.println("Dias da Semana: ");

        //For each para cada dia da semana
        for (DiaSemana dia : DiaSemana.values()) {
            imprimirMensagem(dia);
        }
    }

    public static void imprimirMensagem(DiaSemana dia) {
        String mensagem;

        switch (dia) {
            case SEGUNDA:
                mensagem = "SEGUNDA!";
                break;
            case TERCA:
                mensagem = "TERÇOU";
                break;
            case QUARTA:
                mensagem = "QUARTOU!";
                break;
            case QUINTA:
                mensagem = "QUINTOU!";
                break;
            case SEXTA:
                mensagem = "SEXTOU!";
                break;
            case SABADO:
                mensagem = "SABADO!";
                break;
            case DOMINGO:
                mensagem = "DOMINGOU!";
                break;
            default:
                mensagem = "Dia inválido.";
                break;
        }

        System.out.println(dia.name() + ": " + mensagem);
    }

}
