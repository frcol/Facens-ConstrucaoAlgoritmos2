package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, somaNegativos = 0;

        do {
            System.out.print("Digite um número inteiro (ou zero para sair): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                somaNegativos += numero;
            }
        } while (numero != 0);

        System.out.println("Soma dos números negativos: " + somaNegativos);
    }
}
