package Aula7.Tarefas;

import java.util.Scanner;

/* Faça um Programa que leia um vetor de 5 
números inteiros e mostre-os*/

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
