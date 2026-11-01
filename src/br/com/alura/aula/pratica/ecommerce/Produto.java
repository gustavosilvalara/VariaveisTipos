package br.com.alura.aula.pratica.ecommerce;

public class Produto {
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        if (preco <= 50) {
            categoria = CategoriaProduto.E;
        }else if (preco <= 200) {
            categoria = CategoriaProduto.I;
        }else if (preco > 200) {
            categoria = CategoriaProduto.P;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return "Categoria do produto: " + categoria.getDescricao();
    }
}
