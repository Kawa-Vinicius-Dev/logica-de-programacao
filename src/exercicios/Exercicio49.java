package exercicios;

import java.util.Scanner;

/*
 Escreva um programa que determine se um dado número N (digitado pelo usuário) é
primo ou não
*/
public class Exercicio49 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = verificarNum(sc);
            boolean verificar = verificarInteiro(N);
            if (verificar) {
                System.out.println("Número primo!");
            } else {
                System.out.println("Número não é primo!");
            }
        }
    }

    private static int verificarNum(Scanner sc) {
        while (true) {
            System.out.print("Digite um numero: ");
            if (!sc.hasNextInt()) {
                System.out.println("Erro! Digite um numero!");
                sc.next();
                continue;
            }
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Erro! Digite um numero maior que zero!");
                continue;
            }
            return num;
        }
    }

    private static boolean verificarInteiro(int N) {
        int contador = 2;

        if (N <= 1) {
            return false;
        }

        while (N > contador) {
            if (N % contador == 0) {
                return false;
            }
            contador++;
        }
        return true;
    }
}