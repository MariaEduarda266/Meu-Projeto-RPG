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
                Utilis.esperar(1);
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



            }
            Utilis.limparTela();
        }
    }

    // ATO 1
    public void ato1(Ficha Personagem){

        this.narrarIntroducaodamansao();

        this.escolhadojogador();

        this.processarEscolhaAto1(fichajogador);

        String e07 = ("""
                Você está no hall principal. 
                Seus olhos viajam por todo interior da mansão, que parece muito bem iluminada ali dentro. 
                Existem tapeçarias antigas, quadros rasgados bem preservados e um tapete enorme no chão, vermelho. 
                Ele leva a uma porta que parece trancada. 
                Tudo ali é muito silencioso, e você se questiona se seria uma boa ideia dormir no sofá que caiu, ou até mesmo no chão, mas quando olha para o chão e presta um pouco mais de atenção, percebe que ele está profundamente sujo. 
                Assim como o chão, o sofá está muito empoeirado, e se não fosse por isso você até ficaria naquele hall, mas com a possibilidade de encontrar um lugar maior, você apenas segue para um caminho…
                
                """);
        Utilis.digitar(e07);
        leitor.nextLine();

    }

   public void narrarIntroducaodamansao() {
                Utilis.limparTela();
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
                    Utilis.digitar(textoIntroducao);

            }

   public void escolhadojogador (){
                String escolha01 = ("""
                        O que você faz?
                        1. Dá uma inspecionada no local
                        2.Vai diretamente até a porta
                        3.Vai até a janela, que está entreaberta
                        """);
                Utilis.digitar(escolha01);
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

                            Utilis.digitar(e02);
                            e = leitor.nextLine();
                            System.out.println(e);

                            if (e.equalsIgnoreCase("Voltar")) {
                                String e03 = ("""
                                        Ao voltar, você percebe as entradas principais mais uma vez.
                                        Olhando brevemente a direita, você tem a mesma visão que teve quando encarou a parte mais à esquerda da casa:
                                        \nUm corredor entre a casa e a floresta
                                        """);

                                Utilis.digitar(e03);
                                leitor.nextLine();

                            } else if (e.equalsIgnoreCase("Continuar")) {
                                String e04 = ("""
                                        Quando você se aproxima, você vê o quintal da casa,
                                        mas seus olhos não conseguem enxergar muito,
                                        devido a baixa visão
                                        """);

                                Utilis.digitar(e04);

                                System.out.println("★ GIRE 1d20 + Sorte ★ ");
                                leitor.nextLine();
                                total = valorDado + Personagem.sorte;
                                System.out.println(total);
                                if (total < 10) {
                                    String e05 = ("""
                                            Falha!! Você escuta um barulho vindo da floresta.
                                            É assustador, e seu coração começa a acelerar.
                                            Sua única opção neste momento é retornar
                                            """);

                                    Utilis.digitar(e05);
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
                            Utilis.digitar(e06);
                            leitor.nextLine();

                        }//Janela -- Testar

          }
         }


         // Ato 2

    public void ato2 (){
        this.narrarato2();
    }

    public void narrarato2 (){

        String textoato2 = ("""
                Sem alternativas, você sobe para o segundo andar da casa.  
                A escada range sob seus pés, mas o som ecoa pouco, como se a casa absorvesse barulho. 
                Ao chegar ao segundo andar, ela encontra um hall amplo, iluminado por uma única janela no fundo, coberta por uma cortina fina amarelada pelo tempo. 
                A luz que entra é fraca, quase doente, e você se pergunta como aquela iluminação existe, já que lá fora está tudo escuro.
                """);
        Utilis.digitar(textoato2);
        leitor.nextLine();

        String a02 = ("""
                As quatro paredes do hall estão cobertas por retratos de uma mesma família, em diferentes épocas. 
                Não são quadros baratos, são pinturas a óleo antigas, bem feitas. 
                O casal, uma mulher loira de cabelo curto e olhos azuis, com um sorriso radiante, e um homem de cabelo preto e olhos azuis, mais sério, parecem bem felizes. 
                O que será que aconteceu para a casa estar em tão péssima condição?
                """);
        Utilis.digitar(a02);
        leitor.nextLine();

        String a03 = ("""
                Você não fica no hall por muito tempo, seu instinto vai seguindo os quadros para o corredor principal do segundo andar, e a lanterna do seu celular passa por um de cada vez. 
                Os quadros parecem contar uma história. 
                O casal feliz aparentemente teve filhos, mas seus rostos estão parcialmente rasgados, o que faz com que seu coração acelere um pouco.
                
                """);
        Utilis.digitar(a03);
        leitor.nextLine();

        String a04 = ("""
                Você continua acompanhando os quadros, um por um. 
                Aparecem pessoas que você não conhece, talvez familiares. 
                Por último, aparece um quadro de um homem estranho. 
                Ele está bem vestido, mas você apenas foca em encontrar um quarto para descansar.
                Andando mais pelo corredor, você encontra uma porta branca. 
                
                (ABRIR)
                
                """);
        Utilis.digitar(a04);
        resposta = leitor.nextLine();

            if(resposta.equalsIgnoreCase("Abrir")){
                String quarto = ("""
                        Você vê um quarto enorme, bem preservado pelo tempo, com uma cama bem chique. 
                        A cama está mais bagunçada, mas dá pra tirar a poeira. 
                        Os lençois estão mais limpos que o normal, e aquele quarto lhe causa uma estranha sensação de segurança. 
                        Dentro do quarto, você percebe alguns objetos que te chamam a atenção:
                        """);
                Utilis.digitar(quarto);
                String objetos = ("""
                        1.Criado mudo
                        2.Casaco
                        3.Penteadeira
                        4.Cama - Dormir
                        """);
                Utilis.digitar(objetos);
            }

        System.out.println("Digite o número para investigar, ou ir dormir:");
            int numero = leitor.nextInt();

            switch (numero) { //estrutura de repeticao, e ir escolhendo até acabar as opções
                case 1 -> {
                    System.out.println("""
                            Você encontra a foto de um casal jovem, aquele mesmo dos quadros.
                            A foto parece ser bem antiga, e parece ter sido esquecida pelo tempo...
                            """);
                }
                case 2 -> {
                    System.out.println("""
                            No casaco masculino, você encontra uma chave.
                            Ela parece bem mais bonita e dourada do que a anterior, e parece estar mais bem preservada
                            """);
                }
                case 3 -> {
                    System.out.println("""
                            A penteadeira está quebrada, mas o espelho parece perfeitamente intacto. 
                            Puxando o lençol, você vê seu próprio reflexo, mas sente uma sensação estranha como se alguém estivesse te observando.
                            """);
                }
                case 4 -> {
                    System.out.println("""
                            Você se deita em sua cama, e o sono vem mais rápido que o comum, e você apenas adormece.
                            """);
                }
            }


    }

    public void manhaseguinte(){
        String a01 = ("""
                Quando você acorda, você vê novamente o quarto. 
                Parece normal como na noite anterior. 
                Você volta mais uma vez para o corredor. 
                Passando por ele, você se depara com as mesmas pinturas da noite anterior, porém, existe um detalhe que você não tinha percebido antes. 
                As pinturas aparentam estar rasgadas com garras bem pequenas, e algumas das pinturas que pareciam estar na noite anterior já não estão mais.
                
                """);
        Utilis.digitar(a01);
        leitor.nextLine();

        System.out.println("""
                Chegando ao Hall, coisas que você não enxergava antes, agora você consegue enxergar. 
                Você olha brevemente para as pinturas da noite anterior, mas não há nada fora do normal.
                Ao descer, você vê o hall principal e nele você vê um gato pequeno e bem magro, que está dormindo calmamente. 
                O gato acorda ao ver você, mas não se importa muito com sua presença.
                
                """);
        leitor.nextLine();
        System.out.println("Está de dia, você tenta sair de casa" +
                "(SIM/NÃO)?");
        resposta = leitor.nextLine();

            if (resposta.equalsIgnoreCase("Sim")){
                System.out.println("""
                        Você tenta abrir a porta, mas não consegue. 
                        Mesmo com a chave da porta, ela parece muito emperrada, ou parece estar sendo presa por algo ou alguém. 
                        A janela está diferente de quando você a viu na noite anterior. 
                        Ela está maior, mais quebrada. 
                        Será que mais alguém decidiu entrar na noite anterior? 
                        Ao tentar abrir, a janela parece muito emperrada, e você não consegue sair de lá
                        """);
                leitor.nextLine();
            } else {
                System.out.println("""
                        O gato que estava dormindo antes, agora te olha e mia. 
                        Quando você percebe a presença dele, ele caminha para a porta principal do Hall, e quando ele chega lá, você percebe que a porta está aberta.
                        
                        """);
                leitor.nextLine();
            }

        System.out.println("SEGUIR");
            leitor.nextLine();

        System.out.println("""
                Seguindo, você se depara com mais um corredor enorme, com algumas portas fechadas. 
                Porém, o gato que estava sentado te esperando, volta a caminhar para uma em específico, e para bem à frente dela. 
                Indo até a porta, e a abrindo, você vê uma biblioteca enorme, com livros bem antigos e janelas levando a rua. 
                A floresta lá fora parece estar envolta em uma neblina que você não tinha notado antes.
                Você ouve um barulho, e ao olhar em sua direção, você vê o homem do quadro, no hall de cima. 
                Ele te encara, com um olhar cansado.
                
                """);


    }

    public void conversa1 (){

        System.out.println("""
                Ele: “Que susto! Bom dia…”
                Você: “Quem é você?”
                Ele: “Ah, meu nome é Klaus. Você apareceu aqui quando ein?”
                Você: “...”
                Você: “Você está morando aqui?”
                Ele: “Sim, por que a pergunta?”
                Você: “Nada, é que na noite anterior eu não te vi aqui, nem ouvi nada. Pensei que essa espelunca estava vazia.”
                Ele: (Te olha meio confuso) “De qualquer forma, estava tentando sair desse lugar, mas perdi a chave da porta principal, então estou preso aqui”
                (Falar da chave - 1 / Ficar calado - 2 )
                """);
                int resposta = leitor.nextInt();

                    if (resposta == 1){
                        System.out.println("""
                                Você: “Essa aqui?” procura a chave, mas não a encontra “Que droga, onde foi que eu deixei?”
                                Ele: “Você não me parece muito bem da cabeça”
                                
                                """);
                    } else {
                        System.out.println("""
                                Você: “E você já experimentou pular as janelas daqui?”
                                Ele: “Por qual motivo eu faria isso? Elas são muito altas, e eu não saio dessa biblioteca nem fudendo”
                                
                                """);
                    }


        System.out.println("Você: “E você me parece meio maluco… Vou tentar sair daqui sozinho então”");

        System.out.println("""
                       (Sair da biblioteca)
                       """);
        leitor.nextLine();

        System.out.println("""
                Ao tentar sair da biblioteca, a maçaneta da porta também não funciona. 
                Você procura o gato, mas não o vê. 
                O homem que parecia mendigo, apenas te ignorou e não pareceu estar tentando fechar a porta.
                Ao perceber que você não está conseguindo abrir a porta, ele diz:
                
                Ele: “Não recomendaria você abrir essas portas, essa casa é completamente amaldiçoada. ”
                Você: “Por qual motivo?”
                Ele não diz mais nada, apenas te encara por mais um tempo.
                Ao tentar mais um pouco, a porta finalmente se abre, e ao invés do corredor que leva para o hall, você vê a porta da biblioteca com uma vista para um estádio de futebol. 
                Você fica bem confuso, e acha que talvez esteja delirando.
                
                Ele: “Tá vendo? eu nunca mais consegui sair desse lugar.”
                O homem se aproxima mais, fecha a porta e quando abre mais você vê a floresta escura, muito parecida com a da noite anterior
                Você: “Mas tá de dia… Como isso é possível?”
                Ele: “Não sei, mas eu estou preso aqui há um bom tempo, na verdade nem sei mais como cheguei aqui.”
                Você: “E você não sente mais fome?”
                Ele: “Não sei, tem tempo que eu não sinto fome”
                Você: “Como vamos sair daqui?”
                Ele: “Sinceramente, não sei…”
                
                Ao encarar o chão, você se depara com um jornal até que recente. Ao pegar, você encara a data e o título da manchete:
                
                1980
                MENINX DE X ANOS DESAPARECE MISTERIOSAMENTE EM ESTRADA MAIS CONHECIDA POR SUMIÇOS
                
                E abaixo, uma foto sua
                
                """);
        leitor.nextLine();
    }

    public void atofinal (){

        System.out.println("""
                Você se desespera. 
                Você não estava vivendo nos anos 80, e sim em 2026. 
                Você se lembrava exatamente que era 2026, não 1980 quando você entrou aqui…
                Ao olhar para o homem, ele apenas sorri docemente e diz:
                
                Ele: “Não lembra? Você desapareceu, depois de se despedir dos seus pais com uma promessa de que iria se mudar para mais perto da faculdade”
                Ele fecha a porta mais uma vez, e o dia lá fora parece simplesmente sumir, e volta a ser noite mais uma vez.
                
                """);
        leitor.nextLine();

        System.out.println("Tentar abrir a porta");

        System.out.println("""
                
                Ao tentar abrir a porta para correr dali, você se depara com o corredor mais uma vez. Você apenas corre, e ao correr percebe que tudo ali parece mais bem preservado. O gato, antes magro, está mais gordo e mais saudável. Ao passar pela porta você percebe que todo o hall parece mais bem cuidado, mas os quadros que estão lá mais uma vez, estão olhando para você de um jeito estranho enquanto sorriem.\s
                
                O homem da biblioteca sorri e desce as escadas, com um terno de mordomo e um penteado brilhante de algo que parece gel.
                Ele: “Você está indo embora? Mas já? Nem bebeu um chá, nem mais nada?”
                
                Ele estende a mão, e na mão dele aparece uma bandeja, com um chá e uma taça com algo que parece água.\s
                Ele: “Você não pode me deixar sozinho aqui”
                
                Você sente seu coração começar a acelerar muito
                
                """);

        leitor.nextLine();

        System.out.println("Correr para a porta");

        System.out.println("""
                Ao correr, sua única opção é ir para porta mais uma vez. Você escuta os passos do homem chegando ao hall da casa, e seu coração acelera cada vez mais. A porta está muito emperrada, e você começa a forçar para que ela pelo menos se quebre, e com três empurrões, ela quebra e você consegue sair.\s
                
                Ao sair, está tudo escuro de novo, e o gato que antes estava dentro do corredor, agora estava em cima do seu carro. Ele desce quando te vê, e quando você abre a porta, ele entra junto. Ao olhar para casa, você vê o Klaus, que antes se parecia com um humano, agora se parece apenas como uma criatura esquelética, que mal consegue andar até seu carro sem se entortar
                
                Ao tentar ligar o carro, nas duas primeiras vezes, você não consegue, mas na última finalmente o carro liga, e você apenas corre daquele lugar. Sua respiração está muito acelerada, e o gato vai até seu colo e deita para dormir, marcando vocês dois como os que presenciaram aquele acontecimento esquisitíssimo.
                
                Você continua dirigindo, até finalmente chegar a sua cidade natal. Assim que você chega, você liga o rádio do carro, como uma forma de dizer que você está sim no mundo real, não em um sonho maluco.
                
                Uma voz masculina anuncia naquele momento, uma notícia que somente você e o gatinho sabiam da verdade: Uma mansão localizada na floresta tinha pego fogo na noite anterior.\s
                
                Muito perto de onde você estava, era a mesma mansão… Mas como isso era possível? Você tinha chegado naquela mansão justamente na noite anterior. Você apenas desligou o rádio, e preferiu não imaginar o que de fato tinha acontecido, você apenas chegar em sua casa…\s
                
                """);

    }
}
