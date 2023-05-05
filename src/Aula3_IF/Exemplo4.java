package Aula3_IF;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Username: ");
        String username = scan.nextLine();
        
        System.out.println("Senha: ");
        String senha = scan.nextLine();
        
        if (senha.equals("123456")) {
            System.out.println("Ola "+username+", voce pode acessar."); 
        } else {
            System.out.println("Voce nao tem permissao");
        }
    }
}
