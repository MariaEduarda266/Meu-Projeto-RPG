import java.util.Scanner;

public class Ato2 {

    private Personagens jogador;
    private Scanner leitor;

    public Ato2 (Personagens jogador, Scanner leitor){
        this.jogador = jogador;
        this.leitor = leitor;
    }

    public void executar (){
        this.narrararto2();
        this.escolhaato2();
        this.escolhadoquarto1();
    }

    public void narrararto2 (){
            String escolha = """
                    Sem alternativas, você sobe para o segundo andar da casa.
                    A escada range sob seus pés, mas o som ecoa pouco, como se a casa absorvesse barulho.
                    Ao chegar ao segundo andar, ela encontra um hall amplo, iluminado por uma única janela no fundo, coberta por uma cortina fina amarelada pelo tempo.
                    A luz que entra é fraca, quase doente, e você se pergunta como aquela iluminação existe, já que lá fora está tudo escuro.
                    """;
            Utilis.digitar(escolha,30);
            leitor.nextLine();

            String escolha02 = """
                    As quatro paredes do hall estão cobertas por retratos de uma mesma família, em diferentes épocas.
                    Não são quadros baratos, são pinturas a óleo antigas, bem feitas.
                    O casal, uma mulher loira de cabelo curto e olhos azuis, com um sorriso radiante, e um homem de cabelo preto e olhos azuis, mais sério, parecem bem felizes.
                    O que será que aconteceu para a casa estar em tão péssima condição?
                    """;
            Utilis.digitar(escolha02,30);
            leitor.hasNextLine();

            String escolha03 = """
                    Você não fica no hall por muito tempo, seu instinto vai seguindo os quadros para o corredor principal do segundo andar, e a lanterna do seu celular passa por um de cada vez.
                    Os quadros parecem contar uma história.
                    O casal feliz aparentemente teve filhos, mas seus rostos estão parcialmente rasgados, o que faz com que seu coração acelere um pouco.
                    Você continua acompanhando os quadros, um por um.
                    Aparecem pessoas que você não conhece, talvez familiares.
                    Por último, aparece um quadro de um homem estranho.
                    Ele está bem vestido, mas você apenas foca em encontrar um quarto para descansar.
                    Andando mais pelo corredor, você encontra uma porta branca.
                    """;
            Utilis.digitar(escolha03,30);
            leitor.nextLine();
    }
    public void escolhaato2 (){
        String escolha = """
                O que você faz?
                1. Abre a porta
                2. Continua vasculhando o corredor
                3. Voltar
                """;
        Utilis.digitar(escolha,30);
        leitor.nextLine();

        switch (escolha){
            case "1" -> {
                String narracaodoquarto = """
                        Você vê um quarto enorme, bem preservado pelo tempo, com uma cama bem chique.
                        A cama está mais bagunçada, mas dá pra tirar a poeira.
                        Os lençois estão mais limpos que o normal, e aquele quarto lhe causa uma estranha sensação de segurança.
                        Dentro do quarto, você percebe alguns objetos que te chamam a atenção...
                        """;
                Utilis.digitar(narracaodoquarto,30);
                leitor.nextLine();
            }
            case "2" -> {
                String narrarquarto2 = """
                        Ao continuar vasculhando o corredor, você se depara com uma janela enorme, mas coberta por uma cortina desgastada.
                        Ao lado da janela, você vê uma porta. Ela parece mais antiga e mais mal cuidada, e sua maçaneta está mais desgastada.
                        Repentinamente, a porta se abre, e você vê o interior do quarto. Ele parece mais mal acabado por dentro também.
                        Entrando, você vê todo o quarto destruído, mas ao contrário do anterior, existem vários livros dentro dele.
                        Em especial, você vê um diário, com a foto de uma criança...
                        """;
                Utilis.digitar(narrarquarto2,30);
                leitor.nextLine();
                if (jogador.getGenero().equals("FEM")|| jogador.getGenero().equals("F") || jogador.getGenero().equals("FEMININO")){
                    System.out.println("Você vê a foto de uma menininha, que lembra você levemente quando mais nova\nIsso te assusta, e faz com que um frio gelado passe por seu corpo");
                } else if (jogador.getGenero().equals("MASC") || jogador.getGenero().equals("M") || jogador.getGenero().equals("MASCULINO")){
                    System.out.println("Você vê a foto de uma menininho, que lembra você levemente quando mais novo\nIsso te assusta, e faz com que um frio gelado passe por seu corpo");
                }

                System.out.println("""
                        Ao ver isso, a primeira coisa que você pensa em fazer é correr.
                        Uma sensação muito estranha mexe com você naquele momento, e tudo o que você quer fazer é sair daquele quarto estranho...
                        Você sai do quarto, com a decisão intacta de voltar a segurança do quarto anterior mais uma vez
                        Ao entrar nele, você vê um quarto enorme, bem preservado pelo tempo, com uma cama bem chique.
                        A cama está mais bagunçada, mas dá pra tirar a poeira.
                        Os lençois estão mais limpos que o normal, e aquele quarto lhe causa uma estranha sensação de segurança.
                        Dentro do quarto, você percebe alguns objetos que te chamam a atenção...
                        """);

            }
            case "3" -> {
                System.out.println("""
                        Ao voltar, você se depara mais uma vez com os quadros.
                        Eles são bem esquisitos, mas aos poucos você vai sentindo cada vez menos medo.
                        Porém, não demora muito para que uma chuva repentina começe a cair lá fora.
                        Você volta a sentir uma necessidade estranha de voltar para o quarto, como se isso dependesse de sua segurança, então você simplesmente volta.
                        Ao entrar nele, você vê um quarto enorme, bem preservado pelo tempo, com uma cama bem chique.
                        A cama está mais bagunçada, mas dá pra tirar a poeira.
                        Os lençois estão mais limpos que o normal, e aquele quarto lhe causa uma estranha sensação de segurança.
                        Dentro do quarto, você percebe alguns objetos que te chamam a atenção...
                        """);

            }
            default -> System.out.println("Número digitado errado, por favor digite um número válido");
        }

    }
    public void escolhadoquarto1(){

        boolean viuCriado = false;
        boolean viuCasaco = false;
        boolean viuPenteadeira = false;
        boolean vaiDormir = false;

        while (!vaiDormir) {
            System.out.println("\n--- O QUE VOCÊ VERIFICA? ---");
            if (!viuCriado) {
                System.out.println("1. Criado mudo");
            }
            if (!viuCasaco) {
                System.out.println("2. Casaco");
            }
            if (!viuPenteadeira) {
                System.out.println("3. Penteadeira");
            }
            System.out.println("4. Cama - Dormir");

            int resposta = leitor.nextInt();
            leitor.nextLine();

            switch (resposta) {
                case 1 -> {
                    if (!viuCriado) {
                        System.out.println("""
                                Você encontra a foto de um casal jovem, aquele mesmo dos quadros.
                                A foto parece ser bem antiga, e parece ter sido esquecida pelo tempo...
                                """);
                        viuCriado = true;
                    } else {
                        System.out.println("Você já revirou este criado mudo.");
                    }
                }
                case 2 -> {
                    if (!viuCasaco) {
                        System.out.println("""
                                No casaco masculino, você encontra uma chave.
                                Ela parece bem mais bonita e dourada do que a anterior, e parece estar mais bem preservada
                                """);
                        viuCasaco = true;
                    } else {
                        System.out.println("Você já olhou o casaco.");
                    }
                }
                case 3 -> {
                    if (!viuPenteadeira) {
                        System.out.println("""
                                A penteadeira está quebrada, mas o espelho parece perfeitamente intacto.
                                Puxando o lençol, você vê seu próprio reflexo, mas sente uma sensação estranha como se alguém estivesse te observando.
                                """);
                        viuPenteadeira = true;
                    } else {
                        System.out.println("Melhor não olhar para esse espelho de novo...");
                    }
                }
                case 4 -> {
                    System.out.println("Cansado, você decide deitar na cama e fechar os olhos.");
                    vaiDormir = true;
                }
                default -> System.out.println("Opção inválida! Por favor digite um número válido!");
            }
        }
    }

}
