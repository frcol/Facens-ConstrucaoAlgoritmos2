package Aula2.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Quantos cavalos foram comprados?");
        int numCavalos = scan.nextInt();
        
        // Processamento
        int numFerraduras = numCavalos * 4;
        
        // saida
        System.out.println("O numero necessario de ferraduras sera: "+numFerraduras);
    }
}
