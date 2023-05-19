package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votosNulos = 0;
        int votosEmBranco = 0;

        do {
            System.out.print("Digite o codigo do candidato (ou 0 para sair): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Codigo invalido.");
                    break;
            }
        } while (voto != 0);

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Candidato 4: " + candidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);
    }
}
