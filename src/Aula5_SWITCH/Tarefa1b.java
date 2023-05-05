package Aula5_SWITCH;

import java.util.Scanner;

public class Tarefa1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int opt;
        
        System.out.println("Digite um numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = scan.nextInt();
        
        
        System.out.println("===============================");
        System.out.println("====== DIGITE UMA OPCAO =======");
        System.out.println("[1] Somar\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir");
        System.out.println("===============================");
        opt = scan.nextInt();
        
        // Processamento com saida
        switch (opt) {
            case 1:
                System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
                break;
            case 2:
                System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
                break;
            case 3:
                System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
                break;
            case 4:
                System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
                break;
            default:
                System.out.println("Valor invalido!");
        }
    }
}
