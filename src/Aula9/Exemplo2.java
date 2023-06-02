package Aula9;

public class Exemplo2 {
    public static void main(String[] args) {
        int[][][] matriz = new int[3][3][3];
        int numero = 0;
        
        // Preenchendo a matriz tridimensional com números inteiros crescentes
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = numero;
                    numero++;
                }
            }
        }
        
        // Imprimindo a matriz tridimensional
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    System.out.print(matriz[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println(matriz[0][2][2]);
    }
}

