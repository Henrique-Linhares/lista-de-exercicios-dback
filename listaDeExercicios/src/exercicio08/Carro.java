// Exercício 8: Implemente a relação de composição entre as classes Carro
// e Motor. A classe Motor deve possuir um atributo potencia, e a classe
// Carro deve conter um objeto do tipo Motor. Crie métodos em Carro
// para exibir a potência do motor. Teste criando instâncias de Carro e
// mostrando as informações do motor.
package exercicio08;

public class Carro {
    private Motor motor;
    private String modelo;

    public Carro() {
    }

    public Carro(String modelo, int potenciaMotor) {
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
    }

    public Motor getMotor() {
        return motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirPotenciaMotor() {
        System.out.println(
                "O motor do carro '" + this.modelo + "' possui " + this.motor.getPotencia() + " CV de potência.");
    }

    public int getPotenciaMotor() {
        return this.motor.getPotencia();
    }
}
