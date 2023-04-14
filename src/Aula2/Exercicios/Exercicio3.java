package Aula2.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // ENTRADA
        System.out.println("Nome:");
        String nome = scan.nextLine();
        System.out.println("Endereco:");
        String endereco = scan.nextLine();
        System.out.println("Telefone:");
        String telefone = scan.nextLine();
        System.out.println("Profissao:");
        String profissao = scan.nextLine();
        
        // PROCESSAMENTO
        
        // SAIDA
        System.out.println("\n====================");
        System.out.println("Nome: "+nome);
        System.out.println("Endereco: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("Profissao: "+profissao);
        System.out.println("\n====================");
    }
}
