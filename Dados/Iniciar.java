package Dados;

public class Iniciar {
    public static void main(String[] args) {
        Estado estado = new Estado("Tocantins", "TO");
        Cidade cidade = new Cidade(estado, "Palmas");
        Endereco endereco = new Endereco("15", "1006", 77024596, "Casa", cidade);
        Pessoa pessoa = new Pessoa("victor", "01/11/2001", endereco);
        pessoa.dados();

    }

}
