package exercicios;

/*
* Escreva um programa que permute o valor de duas variáveis inteiras
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        permutarNumeros(input);
        input.close();
    }

    private static int lerNumeroValido(Scanner input, String descricao) {
        boolean valido;
        int numero = 0;
        do {
            System.out.print("Digite o número de " + descricao + ": ");
            if (!input.hasNextInt()) {
                System.out.println("Digite um número valido! ");
                input.next();
                valido = false;
                continue;
            } else {
                numero = input.nextInt();
                valido = true;
            }
        } while (!valido);
        return numero;
    }

    private static void permutarNumeros(Scanner input) {
        int a = lerNumeroValido(input, "a");
        int b = lerNumeroValido(input, "b");
        int temp = a;

        a = b;
        b = temp;

        System.out.println("permuta dos numeros é \na: " + a + "\nb: " + b);
    }
}