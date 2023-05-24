package Aula7.Tarefas;

import java.util.Scanner;

/* Faça um Programa que peça as quatro notas de 3 
alunos, calcule e armazene num vetor a média de 
cada aluno, imprima o número de alunos com 
média maior ou igual a 7.0.*/

public class Tarefa6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[12]; // vetor para armazenar as notas dos 3 alunos
        double[] medias = new double[3]; // vetor para armazenar as médias dos 3 alunos
        int qtdAprovados = 0; // variável para armazenar a quantidade de alunos aprovados
        
        // Laço para ler as notas de cada aluno
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as notas do aluno " + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                notas[i*4+j] = input.nextDouble();
                medias[i] += notas[i*4+j];
            }
            medias[i] /= 4;
            System.out.println("Media: "+medias[i]);
            if (medias[i] >= 7) {
                qtdAprovados++;
            }
        }
        
        System.out.println("Quantidade de alunos com média maior ou igual a 7: " + qtdAprovados);
    }
}
