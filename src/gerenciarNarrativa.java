import java.util.Scanner;

public class gerenciarNarrativa {

    Scanner leitor = new Scanner(System.in);
    Personagens jogador;
    Personagens personagem = new Personagens();
    Ato1 ato1;
    Ato2 ato2;
    Ato3 ato3;
    protected String resposta;

    public void executar (Personagens jogador) {
        this.jogador = jogador;
        this.ato1 = new Ato1(jogador,leitor);
        this.ato2 = new Ato2(jogador,leitor);
        this.ato3 = new Ato3(jogador, leitor);
        ato1.executar();
        ato2.executar();
        ato3.executar();

    }


    public void comecarJogo() {
        Utilis.limparTela();
        Utilis.digitar("Bem vindo a Mansão Holloway!!", 30);
        System.out.println("Você está pronto para começar?(Sim/Não)\nLembre-se: Todas as escolhas afetarão sua história ");
        resposta = leitor.nextLine();
        resposta = resposta.toUpperCase();

        switch (resposta) {
            case "SIM", "S" -> {
                System.out.println("Começando...");
                personagem.getBackstore();
            }

            case "NÃO", "NAO", "N" -> { // caso não...
                System.out.println("Deseja mudar algo mais?");
                resposta = leitor.nextLine();
                resposta = resposta.toUpperCase();
                switch (resposta) {
                    case "SIM", "S" -> {
                        personagem.criarPersonagem();
                        System.out.println("Pronto, aqui sua ficha: ");
                        personagem.exibirficha();
                    }
                }
            }
            default -> System.out.println("Comando não reconhecido, por favor responda com sim ou não");
        }
        Utilis.espaco(2);
    }
    public void finalizarJogo() {
        Utilis.limparTela();
        System.out.println("FIM DE JOGO!");
        Utilis.digitar("Obrigado por jogar " + personagem.getNome() + "!", 30);
        Utilis.esperar(3);
    }


}