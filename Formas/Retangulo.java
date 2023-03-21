package Formas;

public class Retangulo {
    double lado;
    double altura;
    
    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double area(){
        double area;
        area= lado*altura;
        return area;
    }

    public double perimetro(){
        double perimetro;
        perimetro=2*(lado+altura);
        return perimetro;
    }
}
