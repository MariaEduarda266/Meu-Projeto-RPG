public class Utilis {


    private static final int LINHAS_TELA_COMPLETA = 50;
    private static final int LINHAS_ESPACO_PEQUENO = 2;


    public static void limparTela() {
        limparTela(LINHAS_TELA_COMPLETA);
        }
    public static void limparTela (int linhas){
        for (int i = 0; i < linhas; i++){
            System.out.println();
        }
    }

    public static void espaco (){
        limparTela(LINHAS_ESPACO_PEQUENO);
    }
    public static void espaco (int linhas){
        limparTela(linhas);
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep((long)segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("Erro na pausa...");
            Thread.currentThread().interrupt();
        }
    }

    public static void digitar(String mensagem, int velocidade) {
        if (mensagem == null || mensagem.isEmpty()) {
            return;
        }
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();

            if (velocidade > 0) {
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        System.out.println();
    }

}


