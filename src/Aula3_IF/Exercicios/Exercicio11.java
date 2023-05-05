package Aula3_IF.Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        int c = sc.nextInt();
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Números em ordem crescente: " + a + ", " + b + ", " + c);
    }
}
