package Aula7.Tarefas;

import java.util.Scanner;

/* Faça um Programa que leia um vetor de 
10 números reais e mostre-os na ordem inversa.*/

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt();
        }
        
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
