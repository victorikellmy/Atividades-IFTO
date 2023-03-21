package Dados;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    String nome;
    String dataNascimento;
    Endereco endereco;

    public Pessoa(String nome, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String calculaIdade() {
        // Definindo formato da data
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // convertendo dataNasciemnto de acordo com o formato
        LocalDate dataNascimento1 = LocalDate.parse(dataNascimento, date);
        // calculando um periodo de tempo entre duas datas
        Period periodo = Period.between(dataNascimento1, LocalDate.now());
        return periodo.getYears() + " Anos";
    }

    public void dados() {
        System.out.println("----------------------");

        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + calculaIdade());
        endereco.dados();

    }
}
