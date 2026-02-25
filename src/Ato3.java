import java.util.Scanner;

public class Ato3 {

        private Personagens jogador;
        private Scanner leitor;
        private String resposta;
        private int escolha;

    public Ato3 (Personagens jogador, Scanner leitor){
        this.jogador = jogador;
        this.leitor = leitor;
    }

        public void executar (){
            this.narrararto3();
            this.escolhaato3();
            this.corredor();
            this.conversa();
            this.visao();
    }

        public void narrararto3 (){
            String texto01 = ("""
                    Quando você acorda, você vê novamente o quarto.
                    Parece normal como na noite anterior.
                    Você volta mais uma vez para o corredor.
                    Passando por ele, você se depara com as mesmas pinturas da noite anterior, porém, existe um detalhe que você não tinha percebido antes.
                    As pinturas aparentam estar rasgadas com garras bem pequenas, e algumas das pinturas que pareciam estar na noite anterior já não estão mais.
                   """);
            Utilis.digitar(texto01,30);
            leitor.nextLine();

            String texto02 = """
                    Chegando ao Hall, coisas que você não enxergava antes, agora você consegue enxergar.
                    Você olha brevemente para as pinturas da noite anterior, mas não há nada fora do normal.
                    Ao descer, você vê o hall principal e nele você vê um gato pequeno e bem magro, que está dormindo calmamente.
                    O gato acorda ao ver você, mas não se importa muito com sua presença.
                    """;
            Utilis.digitar(texto02,30);
            leitor.nextLine();


    }
        public void escolhaato3(){
            String escolha01 = """
            Está de dia, você tenta sair de casa
            (SIM/NÃO)?
            """;

            Utilis.digitar(escolha01,30);
            String resposta = leitor.nextLine();
            resposta = resposta.trim().toUpperCase();

                if (resposta.equals("SIM") || resposta.equals("S")){
                    System.out.println("""
                           Você tenta abrir a porta, mas não consegue.
                           Mesmo com a chave da porta, ela parece muito emperrada, ou parece estar sendo presa por algo ou alguém.
                           A janela está diferente de quando você a viu na noite anterior.
                           Ela está maior, mais quebrada.
                           Será que mais alguém decidiu entrar na noite anterior?
                           Ao tentar abrir, a janela parece muito emperrada, e você não consegue sair de lá
                           """);
                    Utilis.digitar(resposta,30);
                    leitor.nextLine();
                } else if (resposta.equals("NÃO")||resposta.equals("N")||resposta.equals("NAO")){
                    System.out.println("""
                            O gato que estava dormindo antes, agora te olha e mia.
                            Quando você percebe a presença dele, ele caminha para a porta principal do Hall, e quando ele chega lá, você percebe que a porta está aberta.
                            """);
                    Utilis.digitar(resposta,30);
                    leitor.nextLine();
                } else {
                    System.out.println("Não entendi sua resposta, por favor digite Sim ou Não");
                }

        }
        public void corredor() {
            String corredor = """
                    Seguindo, você se depara com mais um corredor enorme, com algumas portas fechadas.
                    Porém, o gato que estava sentado te esperando, volta a caminhar para uma em específico, e para bem à frente dela.
                    Indo até a porta, e a abrindo, você vê uma biblioteca enorme, com livros bem antigos e janelas levando a rua.
                    A floresta lá fora parece estar envolta em uma neblina que você não tinha notado antes.
                    Você ouve um barulho, e ao olhar em sua direção, você vê o homem do quadro, no hall de cima.
                    Ele te encara, com um olhar cansado
                    """;
            Utilis.digitar(corredor,30);
            leitor.nextLine();

        }
        public void conversa (){
            System.out.println("Ele: Que susto! Bom dia senhorita!!");
            leitor.nextLine();
            System.out.println("""
                    1. Você: Quem é você?
                    2. Você: Você é maluco? O que está fazendo aqui?
                    3. Você: Bom dia, como saio daqui?
                    """);
            escolha = leitor.nextInt();

            switch (escolha) {
                case 1 -> System.out.println("Ele: Me chamo Klaus, é um prazer te conhecer!!\nEle te estende a mão" +
                        "meio suja para cumprimentar...");
                case 2 -> System.out.println("Ele: Maluco? Se eu não sou já já irei ficar, mas não se preocupe comigo, a propósito meu nome é Klaus!!\nEle sorri" +
                        "de um jeito meio esquisito, e você não sabe se está lidando com um maluco mesmo ou não");
                case 3 -> System.out.println("Ele: Bem, você pode apenas passar pela porta, não é como se fosse complicado... Bom, meu nome é Klaus!\n" +
                        "Ele te olha meio estranho, como se você não entendesse, e aponta a porta\n" +
                        "da biblioteca para você");
                default -> System.out.println("Número inválido! Digite um número válido por favor");
            }

            System.out.println("Ele: Bom, não costumo receber visitas aqui, é meio complicdo... E você, qual seu nome?");

            System.out.println("1.Você: Meu nome é " + jogador.getNome());
            System.out.println("2.Você: Por que eu diria meu nome a você??");
            System.out.println("3.Você: Você deve ser drogado pra ser tão estranho assim...");
                escolha = leitor.nextInt();

                switch (escolha){
                    case 1 -> System.out.println("Ele: É um prazer te conhecer " + jogador.getNome());
                    case 2 -> System.out.println("Ele: Por qual motivo você não diria?");
                    case 3 -> System.out.println("Ele: Eu até sou drogado, mas não sou um incoveniente que" +
                            "atrapalha o sono dos outros!!");
                    default -> System.out.println("Número inválido, por favor digite um número válido");
                }

            System.out.println("Você: Poderia pelo menos me ajudar a sair? A porta da sala está emperrada");
            System.out.println("Ele: Sair? Como assim sair? Aqui tem uma saída?");
            System.out.println("""
                Neste momento, você sente o gato se rastejar entre seu pelo. Ele parece mais gordinho e saudável do que antes.
                """);

        }
        public void visao (){
            String texto = ("""
                    Ao se virar para abrir a porta, você acaba vendo ela mais bonita e mais arrumada do que antes.
                    Você ignora, pois pensa que é completamente normal, mas ao abrir a porta, você vê tudo diferente:
                    
                    """);
            Utilis.digitar(texto,30);
            leitor.nextLine();

            String texto02 = """
                    O corredor, que antes estava mais bagunçado e velho, agora parece mais arrumado e novo.
                    Você ouve barulho de fundo, como se houvessem mais pessoas na casa.
                    Quando você se vira, para olhar para o homem, ele já não está mais lá.
                    Ao sair, você apenas segue o barulho, e quando chega mais uma vez ao Hall principal...
                    Várias pessoas, pessoas bem arrumadas, mas com roupas que não eram da sua época.
                    Você começa a pensar que talvez esteja alucinando, e que essas pessoas são apenas fruto de sua imaginação.
                    """;
            Utilis.digitar(texto02,30);
            leitor.nextLine();

            String texto03 = """
                    Ninguem ali olha para você, as pessoas apenas continuam conversando.
                    Quando você olha para escadaria onde você estava, você vê mais uma vez o Klaus, só que desta vez ele está arrumado.
                    Ele parece um mordomo, e quando ele desce, ele faz um breve discurso para todos no salão.
                    Você, mesmo muito perto, não consegue ouvir o discurso dele, parece abafado.
                    Mas repentinamente, algumas pessoas entram na casa disfarçadas, e é tudo muito rápido...
                    """;
            Utilis.digitar(texto03,30);
            leitor.nextLine();

            String texto04 = """
                    Um massacre acontece ali mesmo, e você até tenta correr ou gritar, mas seus pés não se movem de medo.
                    Por sorte, os homens ali não te veem, e apenas passam por você.
                    Quando você finalmente sai do "transe" o gatinho quem está ali miando.
                    Você o vê, e ele está mais gordo ainda, e com o pêlo mais brilhante.
                    De repente, você começa a ouvir vozes estranhas, como se o salão estivesse mais uma vez cheio.
                    Você está de volta no Hall antigo, mas você sente como se aquele Hall estivesse mais uma vez cheio.
                    """;
            Utilis.digitar(texto04,30);
            leitor.nextLine();

        }
}
