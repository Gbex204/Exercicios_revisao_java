package Carro_main;

public class Carro {
    private double velocidade;
    private String placa;
    public Carro(double velocidade, String placa) {
        this.velocidade = velocidade;
        this.placa = placa;
    }
    public double getVelo(){
        return this.velocidade;
    }

    public String calcular_multa(Carro carro, int velocidadeMax){

        if(velocidadeMax <= carro.getVelo() && carro.getVelo() <= (velocidadeMax+10)){
            return "Valor da multa será de R$ 100 !";
        }
        else if((velocidadeMax+11)<= carro.getVelo() && carro.getVelo() <= (velocidadeMax+30)){
            return "Valor da multa será de R$ 183 !";
        }
        else if((velocidadeMax+31) <= carro.getVelo()){
            return "Valor da multa será de R$ 347 !";
        }
        else {
            return "Nenhum valor será cobrado!";
        }
    }
}