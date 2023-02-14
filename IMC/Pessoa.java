package IMC;

public class Pessoa {
    String nome;
    Double peso;
    Double altura;

    public Pessoa(String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    Double IMC() {
        return peso / (altura * altura);

    }

    void status() {
        if (IMC() < 18.5) {

            System.out.println("Você está abaixo do peso ideal");

        }

        else if (IMC() > 18.5 || IMC() < 24.9) {

            System.out.println("Parabéns, você está em seu peso normal");

        }

        else {

            System.out.println("Você está acima de seu peso (sobrepeso).");
        }
    }
}
