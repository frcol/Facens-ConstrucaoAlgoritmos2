package Aula6_WHILE.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        double precoCusto, precoNovo, somaPrecoCusto = 0, somaPrecoNovo = 0;
        int quantidadeProdutos = 0;

        do {
            System.out.print("Digite o c�digo do produto (ou um n�mero negativo para sair): ");
            codigo = scanner.nextInt();

            if (codigo >= 0) {
                System.out.print("Digite o pre�o de custo do produto: R$");
                precoCusto = scanner.nextDouble();

                precoNovo = precoCusto * 1.2; // Aumento de 20%
                somaPrecoCusto += precoCusto;
                somaPrecoNovo += precoNovo;
                quantidadeProdutos++;

                System.out.printf("C�digo do produto: %d | Pre�o novo: R$%.2f\n", codigo, precoNovo);
            }
        } while (codigo >= 0);

        double mediaPrecoCusto = somaPrecoCusto / quantidadeProdutos;
        double mediaPrecoNovo = somaPrecoNovo / quantidadeProdutos;

        System.out.printf("M�dia dos pre�os de custo: R$%.2f | M�dia dos pre�os com aumento: R$%.2f\n",
                mediaPrecoCusto, mediaPrecoNovo);
    }
}
