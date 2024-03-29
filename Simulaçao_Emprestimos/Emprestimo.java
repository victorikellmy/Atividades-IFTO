package Simulaçao_Emprestimos;

public class Emprestimo {
    Cliente cliente;
    double valor_emprestimo;
    double juros;
    int num_Parcelas;

    public Emprestimo(Cliente cliente, double valor_emprestimo, double juros, int num_Parcelas) {
        this.cliente = cliente;
        this.valor_emprestimo = valor_emprestimo;
        this.juros = juros;
        this.num_Parcelas = num_Parcelas;
    }

    public void aprovaçao() {
        if (valor_emprestimo > cliente.salario * 0.30) {
            System.out.println("Emprestimo negado");
        } else
            System.out.println("Emprestimo aceito aceito");
        System.out.printf("valor total pago: %.2f %n", (valorTotal()));
        System.out.printf("valor das parcelas: %.2f %n", (valorParcelas()));

    }

    public double valorTotal() {
        double valorTotal = valor_emprestimo / num_Parcelas;
        double valorSomado = 0;
        for (int i = 0; i < num_Parcelas; i++) {
            valorTotal += valorTotal * (juros / 100);
            valorSomado += valorTotal;
        }
        valorSomado += valor_emprestimo;
        return valorSomado;
    }

    public double valorParcelas() {
        double valorParc = valorTotal() / num_Parcelas;
        return valorParc;
    }
}
