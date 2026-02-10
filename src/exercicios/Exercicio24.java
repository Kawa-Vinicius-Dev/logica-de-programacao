package exercicios;

/*
* Escreva um programa que leia um número e imprima se este número é ou não par.
*/

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        numeroParImpar(input);
        input.close();
    }
    private static double lerNumeroValido (Scanner input){
        boolean valido;
        double numero = 0;

        do {
            System.out.print("Digite um número: ");
            if (!input.hasNextDouble()){
                System.out.println("Digite um número valido! ");
                valido = false;
                input.next();
            }else{
                numero = input.nextDouble();
                valido = true;
            }
        }while (!valido);
        return numero;
    }
    private static void numeroParImpar(Scanner input){

        double numero = lerNumeroValido(input);

        if(numero % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
