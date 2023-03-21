package Automoveis;

public class Iniciar {
    public static void main(String[] args) {
        Automoveis carro = new Automoveis("Cedam", 100000);
        System.out.println("==============================================");
        System.out.println("Carros acima ou igual a 50 mil o imposto e de 15%");
        System.out.println("Carros abaixo de 50 mil o imposto e de 10%");
        System.out.println("Porecentagem da distribuidora e de  5%");
        System.out.println("==============================================");
        System.out.println(carro.dados());
        System.out.printf("Imposto: %.2f %n",carro.imposto(15,10));
        System.out.printf("Porcentagem da Distribuidora %.2f %n",carro.vaDistribuidor(5));
        System.out.printf("Valor Total: %.2f %n",carro.valorVeiculo());
        System.out.println("==============================================");
    }
}
