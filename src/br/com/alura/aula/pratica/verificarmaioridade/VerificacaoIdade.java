package br.com.alura.aula.pratica.verificarmaioridade;

public class VerificacaoIdade {

    static void main() {

        int idade = 17;
        String mensagem;

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
    }
}
