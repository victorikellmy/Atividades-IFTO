package Dados;

public class Cidade {
    Estado estado;
    String nome;

    public Cidade(Estado estado, String nome) {
        this.estado = estado;
        this.nome = nome;
    }

    public void dados() {
        System.out.println("----------------------");
        System.out.println("Cidade:" + nome);
        estado.dados();

    }
}
