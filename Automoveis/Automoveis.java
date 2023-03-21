package Automoveis;



public class Automoveis {
    String modelo;
    double valorFabrica;
    

    public Automoveis(String modelo, double valorFabrica ) {
        this.modelo = modelo;
        this.valorFabrica = valorFabrica;
        
    }

    public String dados(){
        String.valueOf(valorFabrica);
        
        return "Modelo: "+modelo+"|"+"Valor: "+valorFabrica;
        
    } 

    public double imposto(double percentual1,double percentual2){
        double valorImposto;
        if(valorFabrica>=50000){
            valorImposto=valorFabrica*(percentual1/100);
            return valorImposto;
        }
        else{
            valorImposto=valorFabrica*(percentual2/100);
            return valorImposto;
        }

    }

    public double valorComImposto(){
        double valor_e_Imposto;
        valor_e_Imposto=valorFabrica+imposto(15,10);
        return valor_e_Imposto;

    }

    public double vaDistribuidor(double percentual3){
        double valorDistri;
        valorDistri=valorComImposto()*(percentual3/100);
        return valorDistri;
    }

    public double valorVeiculo(){
        double valorTotal;
        valorTotal=valorComImposto()+vaDistribuidor(5);
        return valorTotal;
    }

}