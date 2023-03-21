package Formas;

public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area(){
        double area;
        area= Math.PI *Math.pow(raio, 2);
        return area;
    }

    public double perimetro(){
        double perimetro;
        perimetro=2*Math.PI*raio;
        return perimetro;
    }
    
}
