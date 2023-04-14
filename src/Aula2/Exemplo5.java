package Aula2;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ENTRADA
        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o outro numero: ");
        int num2 = scan.nextInt();
        
        // PROCESSANEMTO
        int resultado = num1 + num2;
        
        // SAIDA
        System.out.println("A soma dos numeros: "+resultado);
    }
}
