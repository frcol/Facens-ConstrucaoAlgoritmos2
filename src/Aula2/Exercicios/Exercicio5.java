package Aula2.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Valor produto:");
        float valorProduto = scan.nextFloat();
        System.out.println("% do desconto: ");
        float porcentagemDesconto = scan.nextFloat();
        
        // Processamento
        float desconto = valorProduto * porcentagemDesconto  / 100;
        float valorProdComDesconto = valorProduto - desconto;
        
        // saida
        System.out.println("\nDesconto: "+desconto
                            +"\nValor do produto com desconto: "+valorProdComDesconto);
        
        
    }
}
