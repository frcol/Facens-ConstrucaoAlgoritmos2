package Aula3_IF.Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        if ((idade >= 18 && idade <= 35) && (altura >= 1.65) && (peso <= 100)) {
            System.out.println("Você está dentro dos limites de idade, altura e peso para o concurso público.");
        } else {
            System.out.println("Você está fora dos limites de idade, altura ou peso para o concurso público.");
        } 

    }
}
