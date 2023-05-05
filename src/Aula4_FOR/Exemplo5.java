package Aula4_FOR;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalDentro = 0;
        int totalFora = 0;
        
        System.out.println("Digite a quantidade de vezes que ira repetir: ");
        int numRepeticoes = scan.nextInt();
        
        for (int i = 1; i <= numRepeticoes; i++) {
            System.out.println(i+") Digite um numero: ");
            int tmp = scan.nextInt();
            
            if (tmp >= 10 && tmp <=20) {
                System.out.println("O numero digitado foi: "+tmp);
                totalDentro++;
            }
            else {
                System.out.println("## NUMERO INVALIDO ##");
                totalFora++;
            }
            
            System.out.println("============================\n");
        }
        System.out.println("============================");
        System.out.println("Numeros dentro: "+totalDentro);
        System.out.println("Numeros fora: "+totalFora);
        System.out.println("============================\n");
        
                
    }
}
