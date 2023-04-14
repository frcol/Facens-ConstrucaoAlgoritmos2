package Aula2.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // ENTRADA
        System.out.println("Digite um numero:");
        float num1 = scan.nextFloat();
        System.out.println("Digite outro numero:");
        float num2 = scan.nextFloat();
        
        // PROCESSAMENTO
        float soma = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;
        
        //SAIDA
        System.out.println("\n========================");
        System.out.println("Soma = "+soma);
        System.out.println("Subtracao = "+sub);
        System.out.println("Multiplicacao = "+mult);
        System.out.printf("Divisao = %.2f\n",div);
        
    }
}
