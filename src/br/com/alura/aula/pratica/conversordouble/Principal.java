package br.com.alura.aula.pratica.conversordouble;

public class Principal {
    public static void main(String[] args) {

        // int não arredonda, simplesmente corta a parte decimal
        // Math.roud arredondamento como na matemática
        // Math.ceil arredondamento para cima
        // Math.floor arredondamento para baixo

        ConversorDouble conversor = new ConversorDouble(20.90);
        System.out.println(conversor.converterDouble());

        System.out.println();

        // Outra forma de fazer

        double valor = 19.50;
        int valorInt = (int) valor;
        System.out.println(valorInt);
    }
}
