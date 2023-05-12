package Aula6_WHILE;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opt = "";
        
        while(!opt.equals("4")) {
            System.out.println("1- Cadastrar, 2- Editar, 3- Apagar, 4-Sair");
            opt = scan.nextLine();
            
            switch(opt) {
                case "1":
                    System.out.println("Cadastrando...");
                    break;
                case "2":
                    System.out.println("Editando...");
                    break;
                case "3":
                    System.out.println("Apgando...");
                    break;
            }
        }
    }
}
