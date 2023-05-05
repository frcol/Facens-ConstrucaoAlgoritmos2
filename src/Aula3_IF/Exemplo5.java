package Aula3_IF;

public class Exemplo5 {
    public static void main(String[] args) {
        int idade = 16;
        String nome = "Alberto";
        
        if (idade >= 18) {
            System.out.println("Voce e maior que 18 anos e pode acessar.");
        } 
        else if (nome.equals("Maria")) {
            System.out.println("Voce e a Maria e pode acessar");
        } 
        else {
            System.out.println("Voce nao pode acessar.");
        }
    }
}
