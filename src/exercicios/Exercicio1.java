package exercicios;

import java.util.Scanner;

/*
 * Desafio:
 * Ler dois números inteiros A e B.
 * Validar que A não seja maior que B.
 * Caso A > B, pedir os valores novamente.
 * Após validação, imprimir todos os números ímpares
 * no intervalo de A até B (inclusive).
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = 0;
        int B = 0;

        while (true) {
            System.out.println("Digite o valor inicial (A) e o final (B): ");
            A = input.nextInt();
            B = input.nextInt();

            if (A > B) {
                System.out.println("ERRO: O primeiro numero nao pode ser maior que o segundo. Tente novamente.");
                System.out.println("---");
            } else {
                break;
            }
            if (A % 2 == 0) {
                A++;
            }
            for (int i = A; i <= B; i += 2) {
                System.out.println(i);
            }

            input.close();
        }
    }
}



