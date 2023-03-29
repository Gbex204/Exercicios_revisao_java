import java.util.Scanner;
public class ano_bissexto {
    int ano;
    public ano_bissexto(int ano){
        this.ano = ano;
    }
    public String calcular_ano(int ano){
        if(ano%400 == 0 || ((ano%100 != 0) && (ano%4 == 0))){
            return "O ano " + ano + "é bissexto!";
        }else{
            return "Não é bissexto!";
        }
    }
}
/*    Criar uma aplicação Java para:
        a. Ler o ano informado pelo usuário (tipo inteiro);
        b. Informar se é bissexto ou não:
        • Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e não por 100); */