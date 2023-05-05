package Aula3_IF;

import java.util.Scanner;

public class Exemplo6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está de folga?");
        boolean folga = scanner.nextBoolean();

        System.out.println("Tem sol?");
        boolean temSol = scanner.nextBoolean();

        if (temSol && folga) { // trocar por || ou por && e ver Tabela verdade
            System.out.println("irei ir passear hoje!!! =D");
        } else {
            System.out.println("Não irei passear! =C");
        }
    }
}
