package Aula2;

public class Exemplo2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
       
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int resto = num1 % num2;
       
        System.out.println("Soma = "+soma);
        System.out.println("Subtração = "+sub);
        System.out.println("Multiplicacao = "+mult);
        System.out.println("Divisao = "+div);
        System.out.println("Resto = "+resto);
        
        //num1 = num1 + 1;
        num1++;
        
        System.out.println("Num1 = "+num1);
        
        // num2 = num2 - 1;
        num2--;
        
        System.out.println("Num2 = "+num2); 
    }
}
