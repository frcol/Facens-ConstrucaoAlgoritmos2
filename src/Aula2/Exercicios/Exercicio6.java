package Aula2.Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Pontos do lider:");
        float pontosLider = scan.nextInt();
        
        System.out.println("Pontos do lanterna:");
        float pontosLanterna = scan.nextInt();
        
        // Processamento
        int numJogos = (int) Math.ceil((pontosLider-pontosLanterna) / 3);
        
        // saida
        System.out.println("\n\nNumero de jogos serao:"+numJogos);
    }
}
