

public class ServicosGerais {

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();

        }
    }

    public static void limpatela() {
        for (int a = 0; a < 2; a++) {
            System.out.println();
        }

    }

    public static void esperar(int segundos) {
        try {
            // O Java conta em milisegundos, então multiplicamos por 1000
            // Ex: se você pedir 2 segundos, ele dorme 2000 milisegundos
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            // Se der erro na pausa, ele só ignora e segue o jogo
            System.out.println("Erro na pausa...");
        }
    }

    public static void digitar(String mensagem) {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }

}


