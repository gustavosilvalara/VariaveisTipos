package br.com.alura.aula.pratica.imparoupar;

public class Principal {
    static void main() {
        ConsultaImparPar consultaImparPar = new ConsultaImparPar(7);
        String resultado = consultaImparPar.consultaImparPar();
        System.out.println("O número é: " + resultado);
    }
}
