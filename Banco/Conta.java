package Banco;

import javax.swing.JOptionPane;

public class Conta {
    public String cliente;
    public float saldo;
    public float limite;

    public Conta(String cliente, float saldo, float limite) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float sacar(float valor) {
        valor = Float.parseFloat(JOptionPane.showInputDialog("informe o saque:"));
        if (saldo + limite >= valor) {
            saldo = saldo - valor;
            JOptionPane.showInputDialog(saldo);
            return saldo;
        }

        else if (saldo + limite < valor) {
            JOptionPane.showInputDialog("Voce nao possuie esse valor na sua conta ");
        }

        else
            JOptionPane.showMessageDialog(null, "sem dinheiro na conta");
        ;
        return saldo;
    }

    public float depositar(float deposito) {
        deposito = Float.parseFloat(JOptionPane.showInputDialog(cliente));

        saldo = saldo + deposito;

        return saldo;
    }

    public void Imprimir() {
        if (saldo >= 1) {
            JOptionPane.showMessageDialog(null,
                    "o cliente " + cliente + " possui:\n Saldo:" + saldo + "\nLimite:" + limite);
        } else {
            limite = saldo;
            saldo = 0;
            JOptionPane.showMessageDialog(null,
                    "o cliente " + cliente + " possui:\n Saldo:" + saldo + "\nLimite:" + limite);
        }

    }

}
