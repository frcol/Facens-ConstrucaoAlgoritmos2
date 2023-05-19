package Aula7;

public class Exemplo3 {
    public static void main(String[] args) {
        
        String[] meses = {"Janeiro", "Fevereiro", "Marco", 
                        "Abril", "Maio", "Junho", "Julho", 
                        "Agosto", "Setembro", "Outubro", 
                        "Novembro", "Dezembro"};
        
        int[] diasDoMes = {31, 28, 31, 30, 10,4,5,6,7,8,8,31};
        
        for (int i = 0; i < meses.length; i++) {
            System.out.println("O mes "+meses[i]+" tem "+diasDoMes[i]+
                                                                " dias");
        }
    }
}
