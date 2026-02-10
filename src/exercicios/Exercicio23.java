package exercicios;

/*
* Escreva um programa que leia um número e exiba o seu módulo.
*/

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Modulo = " + calculoModulo(input));

        input.close();
    }
    private static int lerNumeroValido(Scanner input){
        boolean valido;
        int valor = 0;

        do {
            System.out.print("Digite um número: ");
            if (!input.hasNextInt()){
                System.out.println("Digite um número valido! ");
                valido = false;
                input.next();
            }else{
                valor = input.nextInt();
                valido = true;
            }
        }while (!valido);
        return valor;
    }
    private static int calculoModulo(Scanner input){
        int valor = lerNumeroValido(input);
        return Math.abs(valor);
    }
}
