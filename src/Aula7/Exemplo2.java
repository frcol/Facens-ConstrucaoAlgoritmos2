package Aula7;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*String[] nomes = new String[10];
        
        nomes[0] = "Fabio";
        nomes[1] = "Darth Vader";
        nomes[9] = "Homem Aranha";
        
        System.out.println("No indice 0, temos o nome "+nomes[0]);
        System.out.println("No indice 1, temos o nome "+nomes[1]);
        System.out.println("No indice 2, temos o nome "+nomes[2]);
        System.out.println("No indice 9, temos o nome "+nomes[9]);
        
        int[] idades = new int[50];
        idades[0] = 11;
        idades[49] = 85;
        
        int[] valores = {11, 85, 18, 14, 24};
        System.out.println(valores[3]);
        valores[3] = 100;
        
        // ====================================
        String[] eventos = {"Teatro", "Cinema", "Show", "Yoga"};
        
        
        for (int i = 0; i < eventos.length; i++) {
            System.out.println((i+1)+"- "+eventos[i]);
        }*/
        
        String[] cidades = new String[5];
        
        System.out.println("Digite os nomes das Cidades");
        for (int i = 0; i < cidades.length; i++) {
            System.out.print((i+1)+": ");
            cidades[i] = scan.nextLine();
        }
        
        System.out.println("\n============================");
        for (int i = 0; i < cidades.length; i++) {
            System.out.println(cidades[i]);
        }
        
        
        
     }
}
