package Aula2;

public class Exemplo3 {
    public static void main(String[] args) {
        System.out.println("Pula uma linha");
        System.out.print("Nao pula linha...");
        System.out.println("Viu só?");
        
        System.out.println("\n\nTeste pular\numa linha.");
        System.out.println("\\Meu nome é \"Fábio\"");
        
        String nome = "Fabio";
        int idade = 49;
        System.out.printf("Meu nome e %s e tenho %d anos \n",nome, idade);
        System.out.println("Meu nome e "+nome+" e tenho "+idade+" anos \n");
        
        //todo 
        String faculdade = "Facens";
        int numSemestres = 6;
        System.out.printf("\nEstudo na %s que tem um curso de duracao de %d semestres\n", faculdade, numSemestres);
        System.out.println("Estudo na "+faculdade+" que tem um curso de duracao de "+numSemestres+" semestres");
        // printf e contatenacao
    }
}
