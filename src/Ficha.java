import java.util.ArrayList;
import java.util.Random;

public class Ficha { // Herança ficha para herdar pericias

    int forca, destreza, constituicao, inteligencia, sabedoria, carisma, sorte;
    public ArrayList<String> inventario = new ArrayList<>();


    public Ficha (){
        this.inventario = new ArrayList<>();
    }
    //FICHA
    public void gerarAtributosAleatorios() {
        Random dado = new Random();

        this.forca = dado.nextInt(20) + 1;
        this.destreza = dado.nextInt(20) + 1;
        this.constituicao = dado.nextInt(20) + 1;
        this.inteligencia = dado.nextInt(20) + 1;
        this.sabedoria = dado.nextInt(20) + 1;
        this.carisma = dado.nextInt(20) + 1;
        this.sorte = dado.nextInt(20) + 1;

    }

    public void mostrarFicha() {
        System.out.println("1.Força: " + this.forca);
        System.out.println("2.Destreza: " + this.destreza);
        System.out.println("3.Constituição: " + this.constituicao);
        System.out.println("4.Inteligência: " + this.inteligencia);
        System.out.println("5.Sabedoria: " + this.sabedoria);
        System.out.println("6.Carisma: " + this.carisma);
        System.out.println("7.Sorte: " + this.sorte);

    }

    public void manipularFicha() {
        System.out.println("Rolando dados para seus atributos...");
        this.gerarAtributosAleatorios();
        this.mostrarFicha();
        ServicosGerais.limpatela();
    }
    //MOCHILA
    public void adicionarItem (String item){
        this.inventario.add(item);
        System.out.println("Você pegou " + item);
    }

    public void removerItem (String item){
        if(inventario.contains(item)){
            inventario.remove(item);
            System.out.println("Você removeu " + item);
        } else {
            System.out.println("Item não encontrado na mochila");
        }
    }

    public void mostrarInventario(){
        System.out.println(" -------- MOCHILA -------- ");

        if (this.inventario.isEmpty()){
            System.out.println("Vazia");

        } else {

            for (String item : this.inventario){
                System.out.println("- " + item);
            }
        }
        System.out.println("--------------------------");
    }

    public void verificarsetem (boolean item){
        inventario.contains(item);
        System.out.println(item);
    }
}