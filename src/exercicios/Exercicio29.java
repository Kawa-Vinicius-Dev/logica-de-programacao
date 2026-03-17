package exercicios;

/*
 * Escreva um programa que leia uma letra e mostre se ela é vogal ou consoante.
 */

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (vogalOuConsoante(verificarLetra(sc))) {
            System.out.println("É vogal");
        } else {
            System.out.println("É consoante");
        }
    }

    public static char verificarLetra(Scanner sc) {

        do {

            System.out.print("Digite um letra para a verificar: ");
            String letra = sc.next();
            if (letra.length() == 1 && Character.isLetter(letra.charAt(0)) == true) {
                return letra.charAt(0);

            } else {
                System.out.println("digite uma letra valida!");
            }

        } while (true);
    }

    private static boolean vogalOuConsoante(char c) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vogais.length; i++) {
            if (vogais[i] == c) {
                return true;
            }
        }
        return false;
    }
}

