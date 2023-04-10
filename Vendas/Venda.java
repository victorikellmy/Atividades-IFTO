package Vendas;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
    private LocalDateTime data;
    Item item;
    ArrayList<Item> items = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#,###.00");

    public Venda(LocalDateTime data) {
        this.data = data;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double valor_da_Venda() {
        double valorTotalVendas = 0;
        for (Item item : items) {
            valorTotalVendas += item.total();
        }
        return valorTotalVendas;
    }

    public String imprimirLista() {
        String txt = "";
        for (Item item : items) {
            txt += "-------------------------\n" + "Item:" + item.dados() + "\n";
        }
        return txt;
    }

    public String mostrarDados() {
        return "Horas da venda:" + data.getHour() + ":" + data.getMinute() + "\n" + "Data da venda:"
                + data.getDayOfMonth() + "/" + data.getMonthValue() + "/"
                + data.getYear() + "\n" + imprimirLista() + "\nValorda compra:" + "R$"
                + df.format(valor_da_Venda());
    }
}
