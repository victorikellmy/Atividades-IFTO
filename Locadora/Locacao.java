package Locadora;

public class Locacao {

    int horas;
    double valor_locaçao;

    public Locacao(int horas, double valor_locaçao) {
        this.horas = horas;
        this.valor_locaçao = valor_locaçao;
    }

    public double valor_por_horas() {
        double valor_pagar = valor_locaçao * horas;

        if (horas > 12) {
            valor_pagar = valor_locaçao * 24;
            if (valor_pagar <= 200) {
                valor_pagar = valor_pagar * 1.20;
                return valor_pagar;

            } else {
                valor_pagar = valor_pagar * 1.15;
                return valor_pagar;
            }
        } else {
            return valor_pagar;
        }
    }

    public String imprimir() {

        return "NOTA\nTempo da locaçao:" + horas + "h\nValor por horas:" + valor_locaçao + "\nValor da diaria:"
                + valor_locaçao * 24 + "\nvalor a ser pago:" + valor_por_horas();
    }

}
