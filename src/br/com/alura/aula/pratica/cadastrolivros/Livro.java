package br.com.alura.aula.pratica.cadastrolivros;

import java.util.Locale;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double preco;
    private Categorias categoria;

    public Livro(String titulo, String autor, int numeroPaginas, double preco, Categorias categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void mostrarLivro(){
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                     "Livro cadastrado: \"%s\", de %s." +
                            " Ele possui %d páginas," +
                            " custa R$%.2f e pertence à categoria %s.",
                            titulo, autor, numeroPaginas, preco, categoria.getDescricao());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}
