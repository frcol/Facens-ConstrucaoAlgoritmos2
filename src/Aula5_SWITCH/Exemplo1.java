package Aula5_SWITCH;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = scan.nextLine();
        
        switch(letra) {
            case "a":
                System.out.println("Abacaxi");
                break;
            case "m":
                System.out.println("Morango");
                break;
            case "p":
                System.out.println("Pera");
                break;
            default:
                System.out.println("Letra invalida");
        }
    }
}
