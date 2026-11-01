package br.com.fiap.variaveisetipos.aula01.pratica.valorvariaveis;

public class Principal {
    public static void main(String[] args) {
        Pessoa gustavo = new Pessoa("Gustavo", 17, 1.72, true);
        gustavo.imprimirPessoa();

        // Outra forma de fazer

        System.out.println();

        String nome = "Gustavo";
        int idade = 17;
        double altura = 1.72;
        boolean estudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante: " + estudante);
    }
}
