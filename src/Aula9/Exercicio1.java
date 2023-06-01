package Aula9;

import java.util.Scanner;

/*
Receber  números  do  usuário  para  preencher  um  vetor  de  10  posições, 
porém, só é permitido armazenar no vetor números positivos (repetir até que 
as  10  posições  do  vetor  estejam  preenchidas).  No  final,  exiba  a  soma  de 
todos os números que estão nas posições ímpares do vetor.
*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int index = 0;
        int num = 0;
        int total = 0;
        
        do {
            System.out.println("Digite um número ["+ (index+1) +"]");
            num =  scan.nextInt();
            
            if (num > 0) {
                numeros[index] = num;
                index++;
            }
            else {
                System.out.println("## Digite um número positivo");
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
