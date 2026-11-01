package br.com.alura.aula.pratica.cadastrolivros;

import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Livro livro1 = new Livro("O Pequeno Príncipe",
                                "Antoine de Saint-Exupéry",
                                96,
                                39.9, Categorias.F);
        Livro livro2 = new Livro("Sapiens: Uma Breve História da Humanidade",
                                "Yuval Noah Harari",
                                466,
                                95, Categorias.N);
        Livro livro3 = new Livro("Entendendo Algoritmos",
                                "Aditya Y. Bhargava",
                                264,
                                85, Categorias.T);
        Livro livro4 = new Livro("1499: O Brasil Antes de Cabral",
                                "Reinaldo José Lopes",
                                240,
                                55, Categorias.H);

        Scanner sc = new Scanner(System.in);
        char opcao = sc.next().charAt(0);

        switch (opcao) {
            case 'F':
                livro1.mostrarLivro();
                break;
            case 'N':
                livro2.mostrarLivro();
                break;
            case 'T':
                livro3.mostrarLivro();
                break;
            case 'H':
                livro4.mostrarLivro();
                break;
        }
    }
}
