package Dados;

public class Estado {
    String nome;
    String sigla;

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;

    }

    public void dados() {
        System.out.println("----------------------");
        System.out.println("Estado:" + nome + "-" + sigla);
        System.out.println("----------------------");
    }
}
