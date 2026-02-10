package exercicios;

import java.util.Scanner;

/*
 * Escreva um programa que leia um número e exiba se ele é positivo ou negativo.
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        verificarPositivoNegativo(input);

        input.close();
    }

    private static int lerNumeroValido(Scanner input) {
        boolean valido;
        int valor = 0;

        do {
            System.out.print("Digite um número: ");
            if (!input.hasNextInt()) {
                System.out.println("Digite um número valido: ");
                input.next();
                valido = false;
            }else {
                valor = input.nextInt();
                valido = true;
            }
        }while (!valido);
        return valor;
    }
    private static void verificarPositivoNegativo (Scanner input){
        int valor = lerNumeroValido(input);

        if (valor > 0){
            System.out.println("Positivo!" );
        }else if (valor < 0){
            System.out.println("Negativo!" );
        }else {
            System.out.println("Zero! ");
        }
    }
}
