package exercicios;

/*
 * Converter um inteiro informado menor que 32
 * para sua representação em binário
 */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = lerNumeroValido(input, "o numero");
        converterNumeroBinario(num);

        input.close();
    }

    private static int lerNumeroValido(Scanner input, String nomeCampo) {
        while (true) {
            System.out.println("Digite " + nomeCampo + ": ");

            if (!input.hasNextInt()) {
                System.out.println("Digite um número valido! ");
                input.next();
                continue;
            }
            int numero = input.nextInt();

            if (numero == 0 || numero >= 32) {
                System.out.println("Digite um número de 0 a 31! ");
                continue;
            }
            return numero;
        }
    }

    private static void converterNumeroBinario(int num) {
        String binario = Integer.toBinaryString(num);
        System.out.println(num + " é igual a: " + binario);
    }
}
