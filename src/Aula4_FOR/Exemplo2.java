package Aula4_FOR;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a tabuada: ");
        int tabuada = scan.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int resultado = i * tabuada;
            System.out.println(i + " * " + tabuada + " = " + resultado);
        }
    }
}
