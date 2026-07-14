package exercicios;

/*
Escreva um programa que leia um caracter e diga se ele é uma vogal, consoante, número
ou um símbolo (qualquer outro caracter, que não uma letra ou número).
*/

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite: ");
            char caracter = input.next().charAt(0);

            caracter = Character.toLowerCase(caracter);
            analisarChar(caracter);
        }
    }
    private static void analisarChar(char caracter) {
        if(isvogal(caracter)){
            System.out.println(caracter + " é vogal");
        }
        else if ((Character.isDigit(caracter))) {
            System.out.println(caracter + " numérico");
        } else if (Character.isAlphabetic(caracter)) {
            System.out.println(caracter + " é consoante");
        } else {
            System.out.println("É símbolo");
        }
    }
    private static boolean isvogal(char caracter) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (char vogal : vogais) {
            if (vogal == caracter) {
                return true;
            }
        }
        return false;
    }
}



