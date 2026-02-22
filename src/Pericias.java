
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Pericias {

    private int Diplomacia, Enganacao, Religião, Medicina, Historia, Intimidacao;
    Scanner leitor = new Scanner(System.in);


    public void fichaPericias() {
        System.out.println("Diplomacia - \nEnganação - \nHistória - \nIntimidação - \nMedicina - \nReligião - ");
        System.out.println("Está vazia, vamos configurar. Selecione os numeros abaixo e os coloque" +
                " em ordem, os separando em sua ficha");

    }

    public void numerosGerados() {
        Random pericias = new Random();

        this.Diplomacia = pericias.nextInt(12) + 1;
        this.Enganacao = pericias.nextInt(12) + 1;
        this.Historia = pericias.nextInt(12) + 1;
        this.Intimidacao = pericias.nextInt(12) + 1;
        this.Medicina = pericias.nextInt(12) + 1;
        this.Religião = pericias.nextInt(12) + 1;
        System.out.println(this.Diplomacia + "\n" + this.Enganacao + "\n" + this.Historia +
                "\n" + this.Intimidacao + "\n" + this.Medicina + "\n" + this.Religião);

    }

    public void distribuirAtributos (Scanner leitor){


        ArrayList <Integer> valoresDisponiveis = new ArrayList<>(Arrays.asList(this.Diplomacia, this.Historia,
                this.Medicina, this.Enganacao, this.Religião, this.Intimidacao));

        this.Diplomacia = escolherValores(leitor, "Diplomacia", valoresDisponiveis);
        this.Historia = escolherValores(leitor, "História", valoresDisponiveis);
        this.Medicina = escolherValores(leitor, "Medicina", valoresDisponiveis);
        this.Enganacao = escolherValores(leitor, "Enganação", valoresDisponiveis);
        this.Religião = escolherValores(leitor, "Religião", valoresDisponiveis);
        this.Intimidacao = escolherValores(leitor, "Intimidação", valoresDisponiveis);

        System.out.println("Todas as perícias foram preenchidas");
    }

    private int escolherValores(Scanner leitor, String nomePericia, ArrayList <Integer> lista ){
        while(true){
            System.out.println("Valores ainda disponíveis " + lista);
            System.out.print("Digite o valor para " + nomePericia.toUpperCase() + ": ");

            String entrada = leitor.next();

            try {
                int valor = Integer.parseInt(entrada);

                if (lista.contains(valor)) {

                    lista.remove(Integer.valueOf(valor));
                    return valor;
                } else {
                    System.out.println("Erro: O número " + valor + " não está disponível ou já foi usado!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite apenas números.");
            }

        }

    }

    public void periciasjogador() {
        System.out.println("Sua Ficha de Perícias:");
        this.fichaPericias();
        this.numerosGerados();
        this.distribuirAtributos(leitor);
        System.out.println("Certo, essa sua ficha:");
        this.mostrarPericias();
    }

    public void mostrarPericias() {

        System.out.println("Diplomacia: " + this.Diplomacia);
        System.out.println("Enganação: " + this.Enganacao);
        System.out.println("História: " + this.Historia);
        System.out.println("Intimidação: " + this.Intimidacao);
        System.out.println("Medicina: " + this.Medicina);
        System.out.println("Religião: " + this.Religião);


    }


}


