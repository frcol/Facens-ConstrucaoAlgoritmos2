package Aula5_SWITCH;

import java.util.Scanner;

public class Tarefa2a {
    public static void main(String[] args) {
        // Declaracao de variaveis
        Scanner scan = new Scanner(System.in);
        float valor = 0f;
        boolean isError = false;
        
        // ENTRADA =====================================
        System.out.println("Codigo do produto: ");
        int codProd = scan.nextInt();
        System.out.println("Quantidade: ");
        int qtde = scan.nextInt();
        
        // PROCESSAMENTO =====================================
        switch (codProd) {
            case 100:
                valor = 1.7f;
                break;
            case 101:
                valor = 2.3f;
                break;
            case 102:
                valor = 2.6f;
                break;
            case 103:
                valor = 2.4f;
                break;
            case 104:
                valor = 2.5f;
                break;
            case 105:
                valor = 1f;
                break;
            default:
                isError = true;
        }
        
        float valorTotal = valor * qtde;
        
        // SAIDA =====================================
        System.out.println("\n=====================================");
        if (!isError) {    
            System.out.println("Valor total: "+valorTotal);
        }
        else {
            System.out.println("Produto nao cadastrado");
        }
        System.out.println("=====================================");
    }
}
