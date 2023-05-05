package Aula3_IF.Exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno:");
        double nota = sc.nextDouble();
        
        if (nota >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if (nota < 5.0) {
            System.out.println("Aluno reprovado!");
        } else {
            System.out.println("Aluno em recuperação.");
        }
    }
}
