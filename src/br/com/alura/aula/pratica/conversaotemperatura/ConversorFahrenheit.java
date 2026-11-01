package br.com.alura.aula.pratica.conversaotemperatura;

public record ConversorFahrenheit(int celsius) {

    public double converterFahrenheit() {
        return celsius * 1.8 + 32;
    }
}
