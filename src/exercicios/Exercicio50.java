package exercicios;

import java.util.Scanner;

/*
Escreva um programa que leia um valor e imprima todas as possíveis combinações
em que o lançamento de um par de dados tenha como resultado a soma informada.
*/
public class Exercicio50 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero = lerNumeroValido(sc);
            mostrarCombinacoes(numero);
        }
    }

    private static int lerNumeroValido(Scanner sc) {
        while (true) {
            System.out.print("Digite a soma dos dois dados: ");

            if (!sc.hasNextInt()) {
                System.out.println("ERRO! Digite um número inteiro válido.");
                sc.next();
                continue;
            }

            int numero = sc.nextInt();

            if (numero < 2 || numero > 12) {
                System.out.println("Digite um número entre 2 e 12.");
                continue;
            }

            return numero;
        }
    }

    private static void mostrarCombinacoes(int numero) {
        int quantidadeCombinacoes = 0;

        System.out.println("\nCombinações possíveis:");

        for (int dado1 = 1; dado1 <= 6; dado1++) {
            int dado2 = numero - dado1;

            if (dado2 >= 1 && dado2 <= 6) {
                quantidadeCombinacoes++;

                System.out.printf(
                        "%d. Dado 1: %d | Dado 2: %d%n",
                        quantidadeCombinacoes,
                        dado1,
                        dado2
                );
            }
        }

        System.out.printf(
                "%nTotal de combinações: %d%n",
                quantidadeCombinacoes
        );
    }
}