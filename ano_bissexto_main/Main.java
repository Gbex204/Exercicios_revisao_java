import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        ano_bissexto ano = new ano_bissexto(teclado.nextInt());
        System.out.println(ano.calcular_ano(ano.ano));
    }
}
