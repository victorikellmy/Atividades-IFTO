package Simulaçao_Emprestimos;

public class Iniciador {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("pedro", 10000.00);
        Emprestimo emprestimo = new Emprestimo(cliente, 1000, 10, 5);

        emprestimo.aprovaçao();
        emprestimo.valorParcelas();
        System.out.println("valor total pago:" + emprestimo.valorTotal());
    }
}
