package Aula7;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome: ");
            nomes[i] = scan.nextLine();
        }
        
        System.out.println("Os nomes digitados foram:");
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
