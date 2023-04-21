package Aula3.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Digite um numero:");
        int num = scan.nextInt();
        
        // Processamento
        int resto = num % 2;
        
        // Saida
        if (resto == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
    }
}
