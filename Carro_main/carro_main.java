package Carro_main;

public class carro_main {
    public static void main(String args[]){
        Carro tcross = new Carro(110.00, "GBE4E20");
        System.out.println(tcross.calcular_multa(tcross, 100));
    }
}
