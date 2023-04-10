package Vendas;

public class Item {
    private int quantidade;
    Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double total() {
        double valorTotal;
        valorTotal = produto.getValor() * quantidade;
        return valorTotal;

    }

    public String dados() {

        return produto.dados() + "\nQuantidade:" + quantidade;

    }
}
