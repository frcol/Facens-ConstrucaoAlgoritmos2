package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        do {
            System.out.print("Digite um numero (ou um numero negativo para sair): ");
            numero = scanner.nextInt();

            if (numero >= 0 && numero <= 25) {
                intervalo1++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo2++;
            } else if (numero >= 51 && numero <= 75) {
                intervalo3++;
            } else if (numero >= 76 && numero <= 100) {
                intervalo4++;
            }
        } while (numero >= 0); // sai do laço se o número digitado for negativo

        System.out.println("Numeros no intervalo [0..25]: " + intervalo1);
        System.out.println("Numeros no intervalo [26..50]: " + intervalo2);
        System.out.println("Numeros no intervalo [51..75]: " + intervalo3);
        System.out.println("Numeros no intervalo [76..100]: " + intervalo4);
    }
}
