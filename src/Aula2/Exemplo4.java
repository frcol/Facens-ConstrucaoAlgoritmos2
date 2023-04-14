package Aula2;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        // ENTRADA
        // declara a variavel e atribui um OBJETO
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();
        
        // PROCESSAMENTO
        
        // SAIDA
        System.out.println("Legal, sua idade e "+idade);
    }
}
