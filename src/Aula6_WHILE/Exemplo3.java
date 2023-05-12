package Aula6_WHILE;

public class Exemplo3 {
    public static void main(String[] args) {
        
        int x = 500;
        while(x <= 1000) {
            System.out.println(x);
            x += 100;
        }
        
        for (int i = 500; i <= 1000; i += 100) {
            System.out.println(i);
        }
    }
}
