package br.com.alura.aula.pratica.cadastrolivros;

public enum Categorias {
    F("Ficção"),
    N("Não-ficção"),
    T("Tecnologia"),
    H("Historia");

    private final String descricao;

    Categorias(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
