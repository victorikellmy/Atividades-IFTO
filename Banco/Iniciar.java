package Banco;

import javax.swing.JOptionPane;

public class Iniciar {
    public static void main(String[] args) {
        Conta conta1 = new Conta(null, 0, 0);
        conta1.cliente = JOptionPane.showInputDialog("informe o nome do usuario:");
        conta1.saldo = Float.parseFloat(JOptionPane.showInputDialog("informe o saldo da conta:"));
        conta1.limite = Float.parseFloat(JOptionPane.showInputDialog("informe o limite da conta:"));
        boolean var = true;

        while (var) {
            int num;
            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Escolhas as seguintes opções:\n" + "1-Sacar\n"
                            + "2-posositar\n" + "3-Imprimir dados\n" + "4-Sair"));
            switch (num) {
                case 1:
                    conta1.sacar(num);
                    break;

                case 2:
                    conta1.depositar(num);
                    break;

                case 3:
                    conta1.Imprimir();
                    break;
                case 4:
                    var = false;
            }

        }
    }
}
