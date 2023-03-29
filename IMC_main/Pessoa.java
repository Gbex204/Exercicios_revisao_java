package IMC_main;

public class Pessoa {
    public double altura;
    public double peso;
    public String nome;

    public Pessoa(double altura, double peso, String nome) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
    }

    public String calcularImc(Pessoa pessoa){
        double imc = pessoa.peso/(pessoa.altura*pessoa.altura);
        if(imc <= 18.5) {
            return "Abaixo do peso ideal!";
        }else if(18 < imc && imc <= 25){
            return "Peso ideal!";
        }else if(25 < imc && imc <= 30){
            return "Acima do peso ideal!";
        }else{
            return "Quadro de obesidade!";
        }
    }
}
