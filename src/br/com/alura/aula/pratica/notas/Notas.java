package br.com.alura.aula.pratica.notas;

public record Notas (double nota1, double nota2, double nota3) {

    public double mediaDasNotas(){
        return (nota1 + nota2 + nota3) / 3;
    }
}
