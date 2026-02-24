import java.util.Scanner;

public class Ato2 {

    private Personagens jogador;
    private Scanner leitor;

    public void Ato2 (){
        this.jogador = jogador;
        this.leitor = leitor;
    }

    public void executar (){
        this.narrarato2();
    }

    public void narrarato2 (){
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
}
