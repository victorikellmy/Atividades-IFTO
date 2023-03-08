package Simulaçao_Emprestimos;

public class Iniciador {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("pedro", 10000.00);
        Emprestimo emprestimo = new Emprestimo(cliente, 1000, 10, 10);

        emprestimo.aprovaçao();
        System.out.printf("valor total pago: %.2f %n", (emprestimo.valorTotal()));
        System.out.printf("valor das parcelas: %.2f %n", (emprestimo.valorParcelas()));
    }
}
