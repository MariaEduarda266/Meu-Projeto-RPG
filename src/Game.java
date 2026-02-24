import java.util.Scanner;

public class Game {
    static void main(String[] args) {
        Personagens jogador = new Personagens();
        gerenciarNarrativa narrativa = new gerenciarNarrativa();

        //nomealeatorio.criarPersonagem(); // cria o personagem
        //jogador.criarPersonagem();
        //narrativa.comecarJogo(); // pergunta se tudo ok para começar
        //jogador.gerarBackstory(); // começa a passar a backstory
        narrativa.executar(jogador);

    }
}
// depois, no final, verificar se todos os comandos de ENTER estão funcionando (comando para somente ir caso der enter)
// depois colocar mais escolhas para o personagem principal ir adicionando
//