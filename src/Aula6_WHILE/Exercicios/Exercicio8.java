package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPessoas = 1000;
        int contMulheres = 0;
        int contHomens = 0;
        int contJovens = 0;
        int somaIdades = 0;
        double somaAlturasMulheres = 0;
        int idade, sexo;
        double altura;

        for (int i = 1; i <= numPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            idade = scan.nextInt();

            if (idade < 0) {
                break;
            }
            
            System.out.print("Sexo (0 - feminino, 1 - masculino): ");
            sexo = scan.nextInt();

            System.out.print("Altura: ");
            altura = scan.nextDouble();

            if (sexo == 0) {
                contMulheres++;
                somaAlturasMulheres += altura;
            } else {
                contHomens++;
            }

            if (idade >= 18 && idade <= 35) {
                contJovens++;
            }

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / (contMulheres + contHomens);
        double mediaAlturasMulheres = somaAlturasMulheres / contMulheres;
        double mediaIdadesHomens = (double) somaIdades / contHomens;
        double percJovens = (double) contJovens / numPessoas * 100;

        System.out.println("\nRESULTADOS:");
        System.out.println("Média de idade do grupo: " + mediaIdades);
        System.out.println("Média de altura das mulheres: " + mediaAlturasMulheres);
        System.out.println("Média de idade dos homens: " + mediaIdadesHomens);
        System.out.println("Percentual de jovens (18 a 35 anos): " + percJovens + "%");
    }
}
