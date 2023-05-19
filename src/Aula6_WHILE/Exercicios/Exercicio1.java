package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int soma = 0;
        int quantidade = 0;

        do {
            System.out.print("Digite um valor inteiro positivo (ou um valor negativo para sair): ");
            valor = scanner.nextInt();

            if (valor >= 0) {
                soma += valor;
                quantidade++;
            }
        } while (valor >= 0);

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.printf("A media aritmetica dos valores lidos e: %.2f%n", media);
        } else {
            System.out.println("Nenhum valor foi lido.");
        }
    }
}
