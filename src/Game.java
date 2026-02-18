import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Personagens p1 = new Personagens();
        Ficha f = new Ficha();
        Pericias p = new Pericias();
        Scanner leitor = new Scanner(System.in);
        Narracao texto = new Narracao();


        p1.status();
        f.manipularFicha();
        p.periciasjogador();
        texto.tudoPronto();

        texto.ato1(f);

    }}

