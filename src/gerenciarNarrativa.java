import java.util.Scanner;

public class gerenciarNarrativa {

    Scanner leitor = new Scanner(System.in);
    Personagens jogador;
    Personagens personagem = new Personagens(); // mudar nome temporário
    Ato1 ato1;

    protected String resposta;

// construtor

    public void executar (Personagens jogador) {
        this.jogador = jogador;
        this.ato1 = new Ato1(jogador,leitor);

        ato1.executar();

    } // continuar configurando, depois colocar Personagens Jogador aqui dentro


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