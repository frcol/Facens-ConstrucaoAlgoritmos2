package Aula6_WHILE;

public class Exemplo11 {
    public static void main(String[] args) {
        int valor = 1;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(valor + " ");
                valor++;
            }
            System.out.println("");
        } 
    }
}
