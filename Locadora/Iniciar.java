package Locadora;

public class Iniciar {
    public static void main(String[] args) {
        Locacao locar1 = new Locacao(13, 20);
        locar1.valor_por_horas();
        System.out.println(locar1.imprimir());
    }
}
