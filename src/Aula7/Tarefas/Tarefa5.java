package Aula7.Tarefas;

import java.util.Scanner;

/* Faça um Programa que leia 10 números inteiros 
e armazene-os num vetor. Armazene os números 
pares no vetor PAR e os números IMPARES no 
vetor impar. Imprima os três vetores.*/

public class Tarefa5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        
        int countPar = 0;
        int countImpar = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt();
            
            if (numeros[i] % 2 == 0) {
                pares[countPar] = numeros[i];
                countPar++;
            }
            else {
                impares[countImpar] = numeros[i];
                countImpar++;
            }
        }
         System.out.print("Todos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+", ");
        }
        
        System.out.println("");
        System.out.print("pares: ");
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] != 0) {
              System.out.print(pares[i]+", ");  
            }
        }
        
        System.out.println("");
        System.out.print("impares: ");
        for (int i = 0; i < impares.length; i++) {
            if (impares[i] != 0) {
              System.out.print(impares[i]+", ");  
            }
        }
    }
}
