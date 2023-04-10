package Vendas;

import java.text.DecimalFormat;

public class Produto {
    String descriçao;
    private double valor;
    DecimalFormat df = new DecimalFormat("#,###.00");

    public Produto(String descriçao, double valor) {
        this.descriçao = descriçao;
        this.valor = valor;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String dados() {

        return descriçao + "\n" + "Valor:R$" + df.format(valor);
    }
}
