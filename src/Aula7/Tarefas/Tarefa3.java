package Aula7.Tarefas;

import java.util.Scanner;

/* Faça um Programa que leia 4 notas, 
mostre as notas e a média na tela..*/

public class Tarefa3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0;
        double total = 0;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite uma nota: ");
            notas[i] = scan.nextInt();
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            total += notas[i];
        }
        
        media = total / 4;
        
        System.out.println("Media: "+media);
    }
}
