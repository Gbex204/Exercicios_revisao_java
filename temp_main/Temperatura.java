public class Temperatura {
    public double temperatura;
    public Temperatura(double temp){
        this.temperatura = temp;
    }
    public void calcular_temperaturas(double temp_param){
        double fahrenheit = temp_param * 1.8 + 32;
        double kelvin = temp_param + 273.15;
        double reaumur = temp_param * 0.8;
        double rankine = temp_param * 1.8 + 32 + 459.67;
        System.out.printf("%nCelcius: %.2f%nFahrenheit: %.2f%nKelvin: %.2f%nReaumur: %.2f%nRankine: %.2f%n",temp_param, fahrenheit, kelvin, reaumur, rankine);
    }
}
