package IMC;

public class Iniciar {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(null, null, null);
        pessoa1.nome = "luana";
        pessoa1.altura = 1.60;
        pessoa1.peso = 48.7;

        pessoa1.IMC();
        pessoa1.status();

    }
}
