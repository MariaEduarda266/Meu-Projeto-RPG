import java.util.Scanner;

// ainda tem modificações a serem feitas

    public class Personagens {
        private static final Scanner leitor = new Scanner(System.in);

        private String Backstore;
        private String nome;
        private String genero;
        private int idade;
        private double altura;

        // Getters e Setters
        public String getBackstore() {
            return this.Backstore;
        }

        public String getGenero() {
            return this.genero;
        }

        public String getNome() {
            return this.nome;

        }

        public int getIdade() {
            return this.idade;
        }

        public double getAltura() {
            return altura;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setBackstore(String backstore) {
            this.Backstore = backstore;
        } // colocar a história de início

        public void setNome(String nome) {
            this.nome = (nome != null && !nome.trim().isEmpty()) ? nome : "Desconhecido";
        }

        public void setIdade(int novaIdade) {
            if (novaIdade > 60) {
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
            if (novaAltura > 2d) {
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

        // criar personagens
        public void criarPersonagem() {
            String confirmacao = "";


            do {
                // ajustar um serviços gerais e colocar aqui, com 50. esse serviços gerais vai limpar a tela do backlog, e deixar para organizar o codigo certinho
                System.out.println(" CRIAÇÃO DO SEU PERSONAGEM ");
                System.out.println("Qual seu nome? ");
                this.setNome(leitor.nextLine());
                System.out.println("Quantos anos você tem? (18-60) ");
                this.setIdade(leitor.nextInt());
                leitor.nextLine();
                System.out.println("Qual seu gênero? ");
                this.setGenero(leitor.nextLine());
                System.out.println("Qual sua altura? ");
                this.setAltura(leitor.nextDouble());
                leitor.nextLine();

                // colocar mais um limpa tela aqui
                this.exibirficha();

                System.out.println("Está tudo certo? (SIM/NÃO)");
                confirmacao = leitor.nextLine().toUpperCase();

                if (!confirmacao.equals("SIM")) {
                    System.out.println("Reiniciando a criação da ficha");
                    // limpa tela 2
                }

            } while (!confirmacao.equals("SIM"));


            System.out.println("Seja bem-vindo(a)" + this.nome);
        }

        public void exibirficha() {

            System.out.println("Sua ficha pessoal:");
            System.out.println("👤 INFORMAÇÕES PESSOAIS:");
            System.out.println("   ├─ Nome: " + this.nome);
            System.out.println("   ├─ Gênero: " + this.genero);
            System.out.println("   ├─ Idade: " + this.idade + " anos");
            System.out.println("   └─ Altura: " + String.format("%.2f", this.altura) + "m");
        }

        public void gerarBackstory (){
            String [] backstrories = {
                    "Você voltava de uma viagem noturna depois de uma festa em outra cidade com seus amigos, porém somente você voltou. " +
                            "A estrada era antiga, cercada por árvores retorcidas e neblina espessa.",
                    "Uma chuva leve caia fraca, e depois simplesmente desapareceu. " +
                            "Quando você percebeu, seu motor parou, e seu coração começou a acelerar. " +
                            "Você para em frente a uma mansão aparentemente abandonada, e seu corpo se estremece ao perceber sua imensidão.",
                    "A Mansão Holloway.",
                    "Você não se lembra de ter visto aquela casa em seu GPS, e quando estava indo para festa, também não tinha percebido sua presença tão marcante. " +
                            "Somente agora, você pensa o quanto essa casa parece oportuna naquele momento. " +
                            "Está escuro, e seu motor simplesmente não quer funcionar, a única opção que você enxerga nesse momento é entrar na casa…",
                    "Você vê a porta e a janela, ambas muito próximas, porém ambas lhe chamam a atenção…"
            };

            int indice = (int) (Math.random() * backstrories.length);
            this.Backstore = backstrories[indice];

            System.out.println("Começando...");
            System.out.println(this.Backstore + "\n");
        } // usar depois no main

    }
