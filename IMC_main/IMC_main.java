package IMC_main;

public class IMC_main {
    public static void main(String args[]){
        Pessoa gabriel = new Pessoa(1.75, 80, "Gabriel");
        System.out.println(gabriel.calcularImc(gabriel));
    }
}
