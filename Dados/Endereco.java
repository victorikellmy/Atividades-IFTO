package Dados;

public class Endereco {
    String logadouro;
    String bairro;
    int cep;
    String complemento;
    Cidade cidade;

    public Endereco(String logadouro, String bairro, int cep, String complemento, Cidade cidade) {
        this.logadouro = logadouro;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public void dados() {
        System.out.println("----------------------");
        System.out.println("Endereço");
        System.out.println("Logadouro:" + logadouro);
        System.out.println("Bairro:" + bairro);
        System.out.println("CEP:" + cep);
        System.out.println("Complemento:" + complemento);
        cidade.dados();
    }
}
