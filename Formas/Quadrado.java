package Formas;

public class Quadrado {
   double lado;

    public Quadrado(double lado) {
    this.lado = lado;
    }
   
    public double area(){
        double area;
        area= Math.pow(lado, 2);
        return area;
    }

    public double perimetro(){
        double perimetro;
        perimetro=lado*4;
        return perimetro;
    }
}
