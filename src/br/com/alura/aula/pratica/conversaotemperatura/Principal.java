package br.com.alura.aula.pratica.conversaotemperatura;

public class Principal {
    public static void main(String[] args) {
        ConversorFahrenheit conversor = new ConversorFahrenheit(20);
        double fahrenheit = conversor.converterFahrenheit();
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        System.out.println();

        // Outra forma de fazer

        int celsius = 20;
        double farhrenheitManual = celsius * 1.8 + 32;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
