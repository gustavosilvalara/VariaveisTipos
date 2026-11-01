package br.com.alura.aula.pratica.conversormoeda;

public class ConversorDolares {

    static void main() {

        double valorReais = 451.50;
        double taxaCambio = 5.25;

        double valorDolares = valorReais / taxaCambio;

        System.out.printf("O valor em dólares é: US$ %.2f", valorDolares);
    }
}
