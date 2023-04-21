package Aula3;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // ENTRADA
        System.out.println("Digite um numero:");
        float num1 = scan.nextFloat();
        
        System.out.println("Digite outro numero:");
        float num2 = scan.nextFloat();
        
        float result = num1*num2;
        
        System.out.println("O resultado e: "+result);
    }
}
