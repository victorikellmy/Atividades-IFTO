package Formas;

public class Iniciar {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(5, 3);

        System.out.println("----------------------");
        System.out.println("Circulo");
        System.out.printf("Area: %.2f %n",circulo.area());
        System.out.printf("Perimetro: %.2f %n",circulo.perimetro());
        System.out.println("----------------------");
        System.out.println("Quadrado");
        System.out.printf("Area: %.2f %n",quadrado.area());
        System.out.printf("Perimetro: %.2f %n",quadrado.perimetro());
        System.out.println("----------------------");
        System.out.println("Retangulo");
        System.out.printf("Area: %.2f %n",retangulo.area());
        System.out.printf("Perimetro: %.2f %n",retangulo.perimetro());
        System.out.println("----------------------");
    }
}
