package Aula6_WHILE;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isReady = true;
        int opt = 0;
        
        do {
            System.out.println("Quer sair? Digite 2"); 
            opt = scan.nextInt();
            
            if (opt == 2) {
                isReady = false;
            }
        } while(isReady);
    }
}
