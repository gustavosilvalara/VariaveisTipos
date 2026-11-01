package br.com.alura.aula.pratica.notas;

public class Principal {
    public static void main(String[] args) {
        Notas gustavo = new Notas(7.5, 8.0, 9.0);
        System.out.println("A média das notas é: " + gustavo.mediaDasNotas());

        // Outra forma de fazer

        System.out.println();

        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);
    }
}
