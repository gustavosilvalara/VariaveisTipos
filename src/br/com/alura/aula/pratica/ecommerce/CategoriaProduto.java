package br.com.alura.aula.pratica.ecommerce;

public enum CategoriaProduto {
    E("Econômico"),
    I("Intermediário"),
    P("Premium");

    private String descricao;

    CategoriaProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
