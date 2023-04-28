package Aula3.Exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o preço total da compra:");
        double preco = sc.nextDouble();

        System.out.println("Digite a forma de pagamento (dinheiro, cartao ou debito):");
        String formaPagamento = sc.next();

        double desconto = 0.0;
        double acrescimo = 0.0;

        if (formaPagamento.equals("dinheiro")) {
            desconto = 0.05 * preco;
        } else if (formaPagamento.equals("cartao")) {
            acrescimo = 0.10 * preco;
        } else if (formaPagamento.equals("debito")) {
            acrescimo = 0;
        } else {
            System.out.println("Forma de pagamento inválida!");
	    return;
        }
        
        double precoFinal = preco - desconto + acrescimo;
        System.out.println("Preço final da compra: " + precoFinal);

    }
}
