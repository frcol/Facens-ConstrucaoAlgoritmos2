package Aula5_SWITCH;

import java.util.Scanner;

public class Tarefa1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String operacao = "";
        int result = 0;
        
        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
        
        
        System.out.println("===============================");
        System.out.println("====== DIGITE UMA OPCAO =======");
        System.out.println("[1] Somar\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir");
        System.out.println("===============================");
        int opt = scan.nextInt();
        
        switch (opt) {
            case 1:
                operacao = "+";
                result = num1+num2;
                break;
            case 2:
                operacao = "-";
                result = num1-num2;
                break;
            case 3:
                operacao = "*";
                result = num1*num2;
                break;
            case 4:
                operacao = "/";
                result = num1/num2;
                break;
            default:
                System.out.println("Valor invalido!");
        }
        
        if (opt >=1 && opt <= 4) {
            System.out.printf("%d %s %d = %d\n", num1, operacao, num2, result);   
        }
    }
}
