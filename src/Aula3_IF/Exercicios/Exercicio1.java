package Aula3_IF.Exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int temp;
        
        System.out.println("a = "+a+", b = "+b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("a = "+a+", b = "+b);
    }
}
