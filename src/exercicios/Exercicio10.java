package exercicios;

/*
*Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo
* dado seu raio e sua altura.
* volume = pi * raio * h
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Calcula o volume de uma lata de óleo");
        System.out.println("Digite raio: ");

        double r = verificarNum(input);

        System.out.println("Digite altura: ");

        double h = verificarNum(input);

        double v = calculoVolume(r,h);

        System.out.printf("Volume = %.2f" ,v);

        input.close();

    }
    public static double verificarNum(Scanner input){
        while(true){
            if (!input.hasNextDouble()){
                System.out.println("Digite um valor valido!");
                input.next();
                continue;
            }
            double valor = input.nextDouble();

            if (valor <= 0){
                System.out.println("Digite um numero maior que zero:");
                continue;
            }
            return valor;
        }
    }
    public static double calculoVolume(double r, double h){

        double volume = Math.PI * Math.pow(r , 2) * h;
        return volume;
    }

}
