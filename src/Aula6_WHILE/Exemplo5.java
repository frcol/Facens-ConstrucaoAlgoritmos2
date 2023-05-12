package Aula6_WHILE;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        System.out.println("Senha: ");
        String senha = scan.nextLine();
        
        boolean podeEntrar = senha.equals("123") ? true : false; 
                
        System.out.println(podeEntrar); 
    }
}
