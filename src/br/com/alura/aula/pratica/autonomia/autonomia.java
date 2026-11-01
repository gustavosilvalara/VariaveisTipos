package br.com.alura.aula.pratica.autonomia;

public class autonomia {
    static void main() {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = capacidadeTanque * consumoMedio;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Autnomia máxima: " + autonomiaMaxima);
        System.out.println("Autonomia atual: " + autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        }else {
            System.out.println("Você não conseguirá completar a viagem sem abastecer.");
        }
    }
}
