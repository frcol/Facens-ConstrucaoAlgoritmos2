package Aula3_IF.Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro n�mero:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo n�mero:");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro n�mero:");
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
        System.out.println("N�meros em ordem crescente: " + a + ", " + b + ", " + c);
    }
}
