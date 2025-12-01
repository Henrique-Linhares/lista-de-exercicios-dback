package exercicio08;

public class App {
    public static void main(String[] args) {
        
        Carro gtr = new Carro("GTR-R35", 105);
        Carro ferrari = new Carro("Ferrari F8", 720);
        
        System.out.println("\n--- Carro 1 ---");
        System.out.println("Modelo: " + gtr.getModelo());
        gtr.exibirPotenciaMotor(); 
        System.out.println("Potência acessada: " + gtr.getPotenciaMotor());
        

        System.out.println("\n---Carro 2 ---");
        System.out.println("Modelo: " + ferrari.getModelo());
        ferrari.exibirPotenciaMotor(); 
        System.out.println("Potência: " + ferrari.getPotenciaMotor());
    }
}