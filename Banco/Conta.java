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
        if (saldo >= 1) {
            valor = Float.parseFloat(JOptionPane.showInputDialog("informe o saque:"));

            saldo = saldo - valor;
            JOptionPane.showInputDialog(saldo);
            return saldo;
        } else
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
            limite = limite + (saldo);
            saldo = 0;
            JOptionPane.showMessageDialog(null,
                    "o cliente " + cliente + " possui:\n Saldo:" + saldo + "\nLimite:" + limite);
        }

    }

}
