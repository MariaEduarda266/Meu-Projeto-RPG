import java.util.Scanner;

public class Game {
    static void main(String[] args) {
        Personagens jogador = new Personagens();
        gerenciarNarrativa narrativa = new gerenciarNarrativa();
        Final final0 = new Final();

        jogador.criarPersonagem();
        narrativa.comecarJogo();
        jogador.gerarBackstory();
        narrativa.executar(jogador);
        final0.executarFinal();
        narrativa.finalizarJogo();

    }
}