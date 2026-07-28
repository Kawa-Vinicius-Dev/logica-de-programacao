package exercicios;

import java.util.Scanner;

/*
Escreva um programa que receba um numero inteiro de 1 a 100 e mostre na tela o
numero por extenso.
*/
public class Exercicio41 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = validarNumero(sc);
            numeroExtenso(num);
        }
    }

    private static int validarNumero(Scanner sc) {
        while (true) {
            System.out.print("Digite um numero de (1 à 100): ");
            if (!sc.hasNextInt()) {
                System.out.println("Digite um número valido!");
                sc.next();
                continue;
            }
            int numero = sc.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("Digite um numero valido!");
                continue;
            }
            return numero;
        }
    }
    private static void numeroExtenso(int num) {
       int dezena = num / 10;
       int unidade = num % 10;

       String []extensoAte19 = {"um", "dois", "três", "quatro",
                                "cinco", "seis", "sete", "oito",
                                "nove", "dez", "onze", "doze",
                                "treze", "quatorze", "quinze", "dezesseis",
                                "dezessete", "dezoito", "dezenove",
       };
       String []dezenas = {"vinte", "trinta", "quarenta", "cinquenta",
                           "sessenta", "setenta", "oitenta", "noventa"
       };
       if (num == 100) {
           System.out.println("Cem");
       }else if (dezena == 0) {
           System.out.println(extensoAte19[unidade-1]);
       }else if (unidade == 0) {
           System.out.println(dezenas[dezena-2]);
       } else if (dezena == 1) {
           System.out.println(extensoAte19[num-1]);
       } else {
           System.out.println(dezenas[dezena-2] + " e " + extensoAte19[unidade-1]);
       }
    }
}
