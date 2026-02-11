package exercicios;

/*
* Escreva um programa que leia três números e mostre o maior entre eles.
*/

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double maiorNumero = numeroMax(sc);
        System.out.println("O maior número é: " + maiorNumero);

        sc.close();
    }
    private static double lerNumeroValido(Scanner sc, String descricao){
        boolean valido;
        double numero = 0;

        do {
            System.out.print("Digite o " + descricao + " número: ");
            if (!sc.hasNextDouble()){
                System.out.println("Digite um número valido! ");
                valido = false;
                sc.next();
                continue;
            }
            numero = sc.nextDouble();
            valido = true;
        }while (!valido);
        return numero;
    }
    private static double numeroMax(Scanner sc){
        double numero1 = lerNumeroValido(sc, "primeiro");
        double numero2 = lerNumeroValido(sc, "segundo");
        double numero3 = lerNumeroValido(sc, "terceiro");

        return Math.max(numero1, Math.max(numero2, numero3));

    }
}
