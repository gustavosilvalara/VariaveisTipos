package br.com.alura.aula.pratica.conversordouble;

public record ConversorDouble(double valor) {

    public int converterDouble(){
        return (int) valor;
    }
}
