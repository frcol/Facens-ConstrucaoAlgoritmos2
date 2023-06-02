package Aula9;

import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opt = 0;
        String[] dias =    {"Sexta", "Sabado", "Domingo"};
        String[] eventos = {"Concerto", "Teatro", "Cinema"};
        double[][] precos = { {100, 130, 35},
                              {120, 150, 50},
                              {110, 140, 40} };
        
        /*
        sexta: conceto=100, teatro=130, cinema=35
        sabado: conceto=120, teatro=150, cinema=50
        domingo: conceto=110, teatro=140, cinema=40
        */
        do {
            System.out.println("Escolha o dia:");
            for (int i = 0; i < dias.length; i++) {
                System.out.println("[" + (i + 1) + "] " + dias[i]);
            }

            int dia = scan.nextInt() - 1;

            System.out.println("Escolha o evento:");
            for (int i = 0; i < eventos.length; i++) {
                System.out.println("[" + (i + 1) + "] " + eventos[i]);
            }

            int evento = scan.nextInt() - 1;
            
            System.out.println("o valor do ingresso e " + precos[dia][evento]);
            System.out.println("===============\n");
            System.out.println("Deseja continuar?");
            opt = scan.nextInt();
        } while (opt != 2);
    }
}
