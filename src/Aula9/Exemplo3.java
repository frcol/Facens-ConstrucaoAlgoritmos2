package Aula9;

import java.util.Random;

public class Exemplo3 {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matriz2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        int[][] matrizSoma = new int[3][3];
        
        // Realizando a soma das matrizes
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        // Imprimindo as matrizes
        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        };
        
        System.out.println("\nMatriz Soma:");
        for (int i = 0; i < matrizSoma.length; i++) {
            for (int j = 0; j < matrizSoma[i].length; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}

