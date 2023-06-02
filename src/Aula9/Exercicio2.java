package Aula9;

import java.util.Scanner;

/*
 Receber 10 números  e  armazená-los  em  um  vetor. Copiar os  números 
em outro vetor na ordem inversa e mostrar na tela todas as posições em que 
se tem o mesmo número nos dois vetores. 

Exemplo: 
1  2  3  1  2  3  1  2  3  1 
1  3  2  1  3  2  1  3  2  1 
*/

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int[] numerosInv = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+": ");
            numeros[i] = scan.nextInt();
        }
        
        for (int i = 0; i < numerosInv.length; i++) {
            numerosInv[i] = numeros[9-i];
        }
        
        System.out.println("=======================");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numerosInv[i]+" ");
        }
        
        System.out.println("\n=======================");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numerosInv[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
