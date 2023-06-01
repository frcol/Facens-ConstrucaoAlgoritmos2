package Aula9;

import java.util.Scanner;

/*
Receber  n�meros  do  usu�rio  para  preencher  um  vetor  de  10  posi��es, 
por�m, s� � permitido armazenar no vetor n�meros positivos (repetir at� que 
as  10  posi��es  do  vetor  estejam  preenchidas).  No  final,  exiba  a  soma  de 
todos os n�meros que est�o nas posi��es �mpares do vetor.
*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int index = 0;
        int num = 0;
        int total = 0;
        
        do {
            System.out.println("Digite um n�mero ["+ (index+1) +"]");
            num =  scan.nextInt();
            
            if (num > 0) {
                numeros[index] = num;
                index++;
            }
            else {
                System.out.println("## Digite um n�mero positivo");
            }
        } while (index < 10);
        
        System.out.println("\n===========================");
        for (int i = 1; i <= numeros.length; i += 2) {
            System.out.println(i+": "+numeros[i]);
            total += numeros[i];
        }
        
        System.out.println("Total: "+total);
    }
}
