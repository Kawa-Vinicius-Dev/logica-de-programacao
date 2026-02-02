package exercicios;

/*
 * exercício 1:
 * Ler dois números inteiros A e B.
 * Validar que A não seja maior que B.
 * Caso A > B, pedir os valores novamente.
 * Após validação, imprimir todos os números ímpares.
 * no intervalo de A até B (inclusive).
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B;

        while (true) {
            System.out.println("Digite o valor inicial (A) e o final (B): ");
            A = input.nextInt();
            B = input.nextInt();


            if (A > B) {
                System.out.println("ERRO: O primeiro numero nao pode ser maior que o segundo. Tente novamente.");
                continue;
            }
            break;
        }
        if (A % 2 == 0) {
            A++;
        }
        System.out.println("Números ímpares no intervalo:");
        for (int i = A; i <= B; i += 2) {
            System.out.println(i);
        }

        input.close();
    }
}



