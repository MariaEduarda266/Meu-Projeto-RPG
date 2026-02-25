import java.util.Scanner;

public class Ato1 {

    private Personagens jogador;
    private Scanner leitor;

    public Ato1 (Personagens jogador, Scanner leitor){
        this.jogador = jogador;
        this.leitor = leitor;
    }

    public void executar (){
        this.escolhaJogador();
        this.narrarIntroducao();
    }

    public void escolhaJogador (){
        String textoMenu = """
                O que você faz?
                1.Dá uma inspecionada no local
                2.Vai diretamente até a porta
                3.Vai até a janela, que está entreaberta
                """;
        Utilis.digitar(textoMenu,30);
        Utilis.espaco();

        String escolha = leitor.next().trim();

        switch (escolha){
            case "1" -> {
                String escolha02 = """
                        Quando você olha ao redor da casa, percebe que ela tem dois andares muito grandes.
                        As janelas estão quebradas, e a única iluminação que existe no lugar é a do seu próprio celular.
                        Virando à esquerda, você chega a um corredor entre a parede da casa e a floresta,
                        e no fundo você percebe um portão de ferro.
                        """;
                leitor.nextLine();
                Utilis.digitar(escolha02,30);
                Utilis.espaco();
                System.out.println("""
                        Quando você se aproxima, você vê o quintal da casa,
                        mas seus olhos não conseguem enxergar muito,
                        devido a baixa visão
                        """);

            }
            case "2" -> {
                String escolha03 = """
                        Ao chegar à porta, você encosta sua mão na maçaneta, a fim de abri-la.
                        Um frio passa por seu corpo, te obrigando a olhar para trás.
                        Você não enxerga nada, somente o seu carro.
                        Quando você tenta abrir a porta, não consegue.
                        Ela parece emperrada, enferrujada, mas encarando pela janela da porta, você consegue enxergar o interior da mansão.
                        O hall de entrada é enorme, grande o suficiente para que você consiga dormir adequadamente.
                        Porém você não consegue entrar, e tudo o que lhe resta agora é voltar.
                        """;
                leitor.nextLine();
                Utilis.espaco();
                Utilis.digitar(escolha03,30);

            }
            case "3" -> {
                String escolha04 = """
                        Você percebe que a janela já está aberta, só precisa pular.
                        Ela não é muito alta, mas é o suficiente para que você consiga passar.
                        Quando você anda até a janela, seus pés se inclinam e você apenas se joga para dentro, caindo em cima de um sofá velho mas muito bem conservado.
                        """;
                Utilis.espaco();
                Utilis.digitar(escolha04,30);

            }
            default -> System.out.println("Comando não reconhecido, por favor digite 1/2/3");
        }
    }

    public void narrarIntroducao(){
        Utilis.espaco(5);

        String intro = """
                Você está no hall principal.\s
                Seus olhos viajam por todo interior da mansão, que parece muito bem iluminada ali dentro.\s
                Existem tapeçarias antigas, quadros rasgados bem preservados e um tapete enorme no chão, vermelho.\s
                Ele leva a uma porta que parece trancada.\s
                Tudo ali é muito silencioso, e você se questiona se seria uma boa ideia dormir no sofá que caiu, ou até mesmo no chão, mas quando olha para o chão e presta um pouco mais de atenção, percebe que ele está profundamente sujo.\s
                Assim como o chão, o sofá está muito empoeirado, e se não fosse por isso você até ficaria naquele hall, mas com a possibilidade de encontrar um lugar maior, você apenas segue para um caminho…
                """;
        Utilis.digitar(intro,30);
        Utilis.esperar(2);
    } // configurar certinho

}
