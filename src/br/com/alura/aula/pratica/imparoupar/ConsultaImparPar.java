package br.com.alura.aula.pratica.imparoupar;

public record ConsultaImparPar(int valor) {

    public String consultaImparPar() {
        if (valor % 2 == 0) {
            return "par";
        }else {
            return "ímpar";
        }
    }
}
