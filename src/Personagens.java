import java.util.Scanner;

    public class Personagens {

        public String nome;
        public String genero;
        private int idade;
        private double altura;
        private int vidaAtual;
        private int vidaMaxima = 100;


        public int getIdade() {
            return this.idade;
        }

        public double getAltura() {
            return altura;
        }


        public void setIdade(int novaIdade) {
            if (idade > 60) {
                System.out.println("AVISO!! IDADE MÁXIMA PERMITIDA É 60");
                System.out.println("Ajustando idade para 60 automaticamente...");
                this.idade = 60;
            } else if (novaIdade < 0) {
                System.out.println("AVISO!! IDADE INVÁLIDA");
                System.out.println("Ajustando idade para 18...");
                this.idade = 18;
            } else {
                this.idade = novaIdade;

            }
        }

        public void setAltura(double novaAltura) {
            if (altura > 2d) {
                System.out.println("AVISO!! ALTURA MÁXIMA PERMITIDA É 2 METROS");
                System.out.println("Ajustando altura para 2 metros automaticamente...");
                this.altura = 2;
            } else if (novaAltura < 1) {
                System.out.println("AVISO!! ALTURA MÍNIMA ATINGIDA");
                System.out.println("Ajustando altura para 1...");
                this.altura = 1;
            } else {
                this.altura = novaAltura;
            }

        }


        void status() {
            System.out.println("// --- ESCOLHA SEU PERSONAGEM --- //");
            Scanner leitor = new Scanner(System.in);
            String r = "";


            do {
                System.out.print("Qual seu nome? ");
                nome = leitor.nextLine();
                System.out.print("Quantos anos você tem? (Máximo 60)");
                int valorDigitado = leitor.nextInt();
                leitor.nextLine();
                this.setIdade(valorDigitado);
                System.out.print("Qual seu gênero? ");
                genero = leitor.nextLine();
                System.out.print("Qual sua altura? ");
                altura = leitor.nextDouble();
                leitor.nextLine();
                ServicosGerais.limpatela();
                System.out.println("Bom te conhecer " + nome);
                System.out.println("Pronto(a) para começar o jogo? (SIM/NÃO)\nCaso você ainda não esteja pronta e digitar NÃO, iremos reiniciar sua ficha.");
                r = leitor.nextLine();

                if(!r.equalsIgnoreCase("Sim")){
                    System.out.println("Reiniciando a ficha...");
                }
                ServicosGerais.limpatela();

            } while (!r.equalsIgnoreCase("Sim"));
            System.out.println("Começando o jogo...");

        }


    }


