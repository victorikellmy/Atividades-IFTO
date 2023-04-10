package Vendas;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Iniciar {
  public static void main(String[] args) {
    boolean operador = true;
    Venda vendas = new Venda(LocalDateTime.now());
    while (operador) {
      Produto produto = new Produto(null, 0);
      produto.descriçao = JOptionPane.showInputDialog(null, "Qual o produto");
      produto.setValor(Double.valueOf(JOptionPane.showInputDialog(null, "Qual valor do produto")));
      Item item = new Item(0, produto);
      item.setQuantidade(Integer.valueOf(JOptionPane.showInputDialog(null, "Qual a quantidade do produto")));
      vendas.items.add(item);
      operador = JOptionPane.showConfirmDialog(null, "Quer comprar mais alguma coisa?") == 0;
    }
    JOptionPane.showMessageDialog(null, vendas.mostrarDados());
  }
}
