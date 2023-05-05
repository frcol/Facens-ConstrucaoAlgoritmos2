package Aula4_FOR;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("");
        int max = 100;
        
        for (int i = 1; i <= max; i++) {
            System.out.println("O dobro de " + i + " e "+ i * 2);
        }
    }
}
