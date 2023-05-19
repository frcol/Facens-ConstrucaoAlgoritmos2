package Aula7;

public class Exemplo5 {
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Marco", 
                        "Abril", "Maio", "Junho", "Julho", 
                        "Agosto", "Setembro", "Outubro", 
                        "Novembro", "Dezembro"};
        
        int[] dias = {31, 28, 30, 31, 25, 10, 13, 45, 30, 31, 30, 31};
        
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i] + " tem "+dias[i]+" dias");
        }
    }
}
