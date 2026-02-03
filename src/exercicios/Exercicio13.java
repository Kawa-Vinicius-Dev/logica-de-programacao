package exercicios;

/*
* Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário
* para Km/h. Para tal, multiplique o valor em m/s por 3,6
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double veloms = numeroValido(input, "m/s");
        double velokm =converterMsKm(veloms, "Km/h");

    }
    private static double numeroValido(Scanner input, String descricao){
        boolean valido;
        double velocidade = 0;

        do {

            System.out.print("Digite uma velocidade " + descricao + ":");

           if (!input.hasNextDouble()){
               System.out.println("Dígite um número valido! ");
               input.next();
               valido = false;
               continue;
           }

           velocidade = input.nextDouble();
           valido = velocidade > 0;

           if (!valido){
               System.out.println("Digite um númeoro maior que 0! ");
               continue;
           }
        }while (!valido);
        return velocidade;
    }
    private static double converterMsKm(double veloms, String descricao){
        double converterKm = veloms * 3.6;

        System.out.println("Velocidade em "+ descricao + ": " + converterKm);
        return converterKm;
    }
}
