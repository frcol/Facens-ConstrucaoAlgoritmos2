package Aula7;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        double num = 0;
        int opt;
        double maiorNum = 0;
        double media = 0;
        
        // para calcular a media
        double total = 0;
        int numInteracoes = 0;
        
        Scanner scan = new Scanner(System.in);
       
        do {
            numInteracoes++;
            
            System.out.println("Informe um numero");
            num = scan.nextDouble();
            total += num;
            
            if (num > maiorNum) {
                maiorNum = num;
            }
            
            System.out.println("1- Continuar, 2- Sair");
            opt = scan.nextInt();
        } while(opt != 2);
        
        media = total/numInteracoes;
        
        System.out.println("Maior numero = "+maiorNum);
        System.out.println("Media = "+media);
    }
}
