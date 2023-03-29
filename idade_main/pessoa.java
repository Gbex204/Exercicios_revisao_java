public class pessoa {
    int dia;
    int mes;
    int ano;
    public pessoa(int dia, int mes, int ano){
        this.dia = dia; this.mes = mes; this.ano = ano;
    }

    public int calcular_idade(int dia, int mes, int ano){
        int dia_atual = 28; int mes_atual = 03; int ano_atual = 2023;
        int idade_ano = ano_atual - ano;
        if(mes_atual < mes){
            idade_ano = idade_ano - 1;
        } else if(mes_atual == mes && dia_atual < dia){
            idade_ano = idade_ano - 1;
        }
        return idade_ano;
    }
}
