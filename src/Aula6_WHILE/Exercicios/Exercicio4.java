package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0, contador = 0;

        while (true) {
            System.out.print("Digite um numero (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // sai do laço se o número digitado for zero
            }

            if (numero % 2 == 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            double media = soma / (double) contador;
            System.out.println("Media dos numeros pares digitados: " + media);
        } else {
            System.out.println("Nenhum numero par foi digitado.");
        }
    }
}
