import java.util.Scanner;

public class Final {

    private Personagens jogador;
    private Scanner leitor;

    public void executarFinal(){
        this.Final();
        this.epigrafe();
    }

    public void Final (){
        String texto = """
                Você finalmente sente suas pernas se moverem, e um medo absurdo.
                O gato também sente, por isso vai correndo até a porta.
                Mais e mais vozes começam a ecoar no Hall, e a sua única opção naquele momento é correr.
                A porta continua aparentar estar emperrada, e quando você chega nela, mesmo empurrando você continua sentindo ela não querer abrir.
                Você sente mãos pegando em seus ombros e te puxando para dentro da casa, e conforme você tenta abrir a porta cada vez mais, mais 
                    mãos você sente.
                """;
        Utilis.digitar(texto,30);
        leitor.nextLine();

        String texto02 = """
                Depois de finalmente tentar, e muito, você consegue abrir a porta.
                Você se depara com seu carro, e o gato corre para ele também.
                Você apenas corre, com um desespero enorme, e abre a porta do carro, não aguentando mais ouvir as vozes.
                Ao abrir, o gato entra mais uma vez, e quando você volta a encarar a casa, você vê apenas um vulto preto te dando tchau... o homem estranho?
                Você finalmente entra,e ao entrar você apenas pisa fundo no acelerador.
                Nenhum pensamento de como o carro está funcionando passa por sua cabeça, e tudo o que você pensa é em sair daquele lugar o mais rápido
                    possível
                """;
        Utilis.digitar(texto02,30);
        leitor.nextLine();



    }

    public void epigrafe (){
        Utilis.limparTela();

        String epigrafe = ("""
                Depois de horas, e de seu coração finalmente parar de bater muito forte, você vê sua cidade chegando.
                O gato está deitado em seu colo, dormindo calmamente.
                Você liga o rádio, para colocar uma música ou ouvir alguma notícia, e você ouve:
                """);
        Utilis.digitar(epigrafe,30);
        leitor.nextLine();

        String noticia = """
                RÁDIO: Atenção, ouvintes da Rádio Continental.
                Interrompemos nossa programação musical habitual para trazer uma triste lembrança.
                E peço, desde já, que tirem as crianças da sala.
                """;
        Utilis.digitar(noticia,30);
        leitor.nextLine();

        String noticia02 = """
                RÁDIO: Hoje completam-se 60 anos desde o massacre da mansão Holloway.
                A tragédia abateu-se sobre a nossa região e trouxe grande pesar para sociedade.
                A família Holloway sempre foi muito importante para toda esta cidade pacata, são os fundadores da cidade, e morreram em uma
                    situação lastimável.
                """;
        Utilis.digitar(noticia02,30);
        leitor.nextLine();

        String noticia03 = """
                RÁDIO: A imponente e isolada Mansão Holloway, residência de uma das famílias mais tradicionais e reclusas do nosso estado,
                    foi o palco de um massacre cujos contornos desafiam a própria sanidade.
                Nossos repórteres da época relatam que viaturas da força policial cercaram a propriedade, mas o que encontraram lá dentro...
                os veteranos da lei descrevem como um verdadeiro cenário de pesadelo.
                """;
        Utilis.digitar(noticia03,30);
        leitor.nextLine();

        String noticia04 = """
                RÁDIO: Não houveram sobreviventes confirmados.
                Os convidados do banquete de outono da família Holloway parecem ter sumido na escuridão, e nunca mais encontramos seus corpos,
                    deixando para trás apenas o eco de horrores que a polícia se recusa a detalhar.
                Não houve sinais de arrombamento.
                Não houve pedidos de socorro.
                Apenas a chuva pesada que castigou a estrada de terra durante toda a noite, isolando a mansão do resto do mundo.
                """;
        Utilis.digitar(noticia04,30);
        leitor.nextLine();

        String noticia05 = """
                RÁDIO: E hoje prestamos mais uma homenagem à essas vítimas.
                Que Deus tenha misericórdia daquelas almas.
                Retornaremos com mais informações a qualquer instante..."
                """;
        Utilis.digitar(noticia05,30);
        leitor.nextLine();

        String pensamentofinal = """
                Você nunca tinha parado para prestar atenção a isso, nunca tinha sequer conhecimento de que essa família era importante...
                Você apenas continua dirigindo, tendo certeza de que se mais alguém cruzar aquela mansão amaldiçoada, vai presenciar algo muito pior...
                """;
        Utilis.digitar(pensamentofinal,30);
        leitor.nextLine();
    }
}
