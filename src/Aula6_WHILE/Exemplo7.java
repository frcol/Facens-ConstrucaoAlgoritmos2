package Aula6_WHILE;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt = 0;
        
        do {
            System.out.println("[1] CADASTRAR, [2] SAIR");
            opt = scan.nextInt();
            
            switch (opt) {
                case 1:
                    System.out.println("CADASTRAR");
                    break;
                case 2:
                    System.out.println("SAIR");
                    break;
                default:
                    System.out.println("## OPCAO INVALIDA ##");
            }
        } while(opt != 2);
    }
}
