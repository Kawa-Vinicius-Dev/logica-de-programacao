package exercicios;

import java.util.Scanner;

/*
Escreva um programa que leia 5 números, e imprima a média entre eles
*/
public class Exercicio46 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int soma = 0;

            int [] numeros = new int [5];
            for (int i = 0; i < numeros.length; i++){
                System.out.print("Numero (" + i + "): ");
                numeros[i] = sc.nextInt();
                soma += numeros[i];
            }
            System.out.println(soma/ numeros.length);
        }
    }
}