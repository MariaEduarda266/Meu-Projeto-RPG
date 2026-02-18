import java.util.Scanner;
import java.util.Random;
public class Narracao {

    Scanner leitor = new Scanner(System.in);
    Random dado = new Random();
    Personagens nome = new Personagens();
    Ficha fichajogador = new Ficha();
    Pericias minhasPericias = new Pericias();

    int escolha, total;
    private int valorDado = dado.nextInt(20) + 1;
    String e, resposta;

    public void tudoPronto() {
        System.out.println("Tudo Pronto? (SIM/NÃO)");
        resposta = leitor.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Começando o jogo...");

        } else {
            System.out.println("Deseja mudar algo mais?(SIM/NÃO)");
            resposta = leitor.nextLine();
            if (resposta.equalsIgnoreCase("Não") || resposta.equalsIgnoreCase("Nao")) {
                System.out.println("Começando o jogo...");
                ServicosGerais.esperar(1);
            } else {

            }
            if (resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Deseja ver sua Ficha ou suas Perícias? (FICHA/PERÍCIA)");
                resposta = leitor.nextLine();

                if (resposta.equalsIgnoreCase("Ficha")) {
                    fichajogador.gerarAtributosAleatorios();
                    fichajogador.mostrarFicha();

                } else if (resposta.equalsIgnoreCase("Pericia") || resposta.equalsIgnoreCase("Perícia") || resposta.equalsIgnoreCase("Perícias") || resposta.equalsIgnoreCase("Pericias")) {
                    minhasPericias.mostrarPericias();

                } else {
                    System.out.println("Não entendi, digite novamente...");
                }

                System.out.println("Começando o jogo...");

                ServicosGerais.limpatela();

            }
            ServicosGerais.limparTela();
        }
    }

    // ATO 1
    public void ato1(Ficha Personagem){
        ServicosGerais.limpatela();
        this.narrarIntroducaodamansao();
        ServicosGerais.limpatela();
        this.escolhadojogador();
        ServicosGerais.limpatela();
        this.processarEscolhaAto1(fichajogador);

        String e07 = ("""
                Você está no hall principal. 
                Seus olhos viajam por todo interior da mansão, que parece muito bem iluminada ali dentro. 
                Existem tapeçarias antigas, quadros rasgados bem preservados e um tapete enorme no chão, vermelho. 
                Ele leva a uma porta que parece trancada. 
                Tudo ali é muito silencioso, e você se questiona se seria uma boa ideia dormir no sofá que caiu, ou até mesmo no chão, mas quando olha para o chão e presta um pouco mais de atenção, percebe que ele está profundamente sujo. 
                Assim como o chão, o sofá está muito empoeirado, e se não fosse por isso você até ficaria naquele hall, mas com a possibilidade de encontrar um lugar maior, você apenas segue para um caminho…
                
                """);
        ServicosGerais.digitar(e07);
        leitor.nextLine();

    }

   public void narrarIntroducaodamansao() {
                ServicosGerais.limparTela();
                String textoIntroducao = """
                         Você voltava de uma viagem noturna depois de uma festa em outra cidade com seus amigos.
                        A estrada era antiga, cercada por árvores retorcidas e neblina espessa.
                        Uma chuva leve caia fraca, e depois simplesmente desapareceu.
                        Quando você percebeu, seu motor parou, e seu coração começou a acelerar.
                        Você para em frente a uma mansão aparentemente abandonada, e seu corpo se estremece ao perceber sua imensidão.
                        A Mansão Holloway.
                        Você não se lembra de ter visto aquela casa em seu GPS, e quando estava indo para festa,
                        também não tinha percebido sua presença tão marcante.
                        Somente agora, você pensa o quanto essa casa parece oportuna naquele momento.
                        Está escuro, e seu motor simplesmente não quer funcionar, a única opção que você enxerga nesse momento é entrar na casa.
                        Você vê a porta e a janela, ambas muito próximas, porém ambas lhe chamam a atenção
                        """;
                    ServicosGerais.digitar(textoIntroducao);

            }

   public void escolhadojogador (){
                String escolha01 = ("""
                        O que você faz?
                        1. Dá uma inspecionada no local
                        2.Vai diretamente até a porta
                        3.Vai até a janela, que está entreaberta
                        """);
                ServicosGerais.digitar(escolha01);
                escolha = leitor.nextInt();
                leitor.nextLine();

            }

   public void processarEscolhaAto1(Ficha Personagem){
                    switch (escolha){
                        case 1 -> {
                            String e02 = ("""
                                    Quando você olha ao redor da casa, percebe que ela tem dois andares muito grandes.
                                    As janelas estão quebradas, e a única iluminação que existe no lugar é a do seu próprio celular.
                                    Virando à esquerda, você chega a um corredor entre a parede da casa e a floresta,
                                    e no fundo você percebe um portão de ferro.
                                    \n
                                    (VOLTAR/CONTINUAR)
                                    """);

                            ServicosGerais.digitar(e02);
                            e = leitor.nextLine();
                            System.out.println(e);

                            if (e.equalsIgnoreCase("Voltar")) {
                                String e03 = ("""
                                        Ao voltar, você percebe as entradas principais mais uma vez.
                                        Olhando brevemente a direita, você tem a mesma visão que teve quando encarou a parte mais à esquerda da casa:
                                        \nUm corredor entre a casa e a floresta
                                        """);

                                ServicosGerais.digitar(e03);
                                leitor.nextLine();

                            } else if (e.equalsIgnoreCase("Continuar")) {
                                String e04 = ("""
                                        Quando você se aproxima, você vê o quintal da casa,
                                        mas seus olhos não conseguem enxergar muito,
                                        devido a baixa visão
                                        """);

                                ServicosGerais.digitar(e04);

                                System.out.println("★ GIRE 1d20 + Sorte ★ ");
                                leitor.nextLine();
                                ServicosGerais.limpatela();
                                total = valorDado + Personagem.sorte;
                                System.out.println(total);
                                if (total < 10) {
                                    String e05 = ("""
                                            Falha!! Você escuta um barulho vindo da floresta.
                                            É assustador, e seu coração começa a acelerar.
                                            Sua única opção neste momento é retornar
                                            """);

                                    ServicosGerais.digitar(e05);
                                } else {
                                    System.out.println("""
                                            Sucesso!! \nObservando bem o portão, você encontra no chão uma chave dourada e enferrujada.
                                            """);
                                    fichajogador.adicionarItem(" -‘๑’- Chave enferrujada -‘๑’-");
                                }

                            } else{
                                this.escolhadojogador();
                            }
                        }// Explorar

                        case 2 -> {

                            fichajogador.verificarsetem(false);
                            {
                                System.out.println("""
                                        Ao chegar à porta, você encosta sua mão na maçaneta, a fim de abri-la. 
                                        Um frio passa por seu corpo, te obrigando a olhar para trás. Você não enxerga nada, somente o seu carro. 
                                        Quando você tenta abrir a porta, não consegue. 
                                        Ela parece emperrada, enferrujada, mas encarando pela janela da porta, você consegue enxergar o interior da mansão. 
                                        O hall de entrada é enorme, grande o suficiente para que você consiga dormir adequadamente. 
                                        Porém você não consegue entrar, e tudo o que lhe resta agora é voltar.
                                        """);

                            }
                            fichajogador.verificarsetem(true);{
                            System.out.println("""
                                    Você lembra da chave que encontrou no corredor, e a pega. 
                                    Ela encaixa perfeitamente, e ao girar você escuta um clique bem suave, e a porta abre silenciosamente.
                                    """);

                            fichajogador.removerItem("Chave enferrujada");
                            }
                        }// Porta -- Testar

                        case 3 -> {
                            String e06 = ("""
                                    Você percebe que a janela já está aberta, só precisa pular. 
                                    Ela não é muito alta, mas é o suficiente para que você consiga passar. 
                                    Quando você anda até a janela, seus pés se inclinam e você apenas se joga para dentro, caindo em cima de um sofá velho mas muito bem conservado.
                                    """);
                            ServicosGerais.digitar(e06);
                            leitor.nextLine();

                        }//Janela -- Testar

          }
         }

   // HALL PRINCIPAL
}
