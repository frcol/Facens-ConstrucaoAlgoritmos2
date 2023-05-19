package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int peso, idade, mais90 = 0, somaIdades = 0;
        double mediaIdades;
        
        for(int i = 1; i <= 7; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            idade = scan.nextInt();
            
            System.out.println("Digite o peso da pessoa " + i + ":");
            peso = scan.nextInt();
            
            somaIdades += idade;
            
            if(peso > 90) {
                mais90++;
            }
        }
        
        mediaIdades = (double) somaIdades / 7;
        
        System.out.println("Quantidade de pessoas com mais de 90kg: " + mais90);
        System.out.println("Média das idades: " + mediaIdades);
    }
}
