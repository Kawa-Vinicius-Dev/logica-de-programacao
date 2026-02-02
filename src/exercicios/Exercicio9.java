package exercicios;

/*
Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32)
leu um valor de temperatura em Fahrenheit e exibi-lo em Celsius
 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Converte temperatura Fahrenheit para Celsius ");
        System.out.println("Digite o valor em Fahrenheit: ");

        double f = validarFahr(input);
        double c = converterCelsius(f);

        System.out.printf("%.3f F equivale a %.3f C\n", f, c);

        input.close();

    }
    private static double validarFahr(Scanner input){
        while (true){
            if (!input.hasNextDouble()){
                System.out.println("Digite um valor valido!");
                input.next();
                continue;
            }
            return input.nextDouble();
        }
    }

    private static double converterCelsius (double f){

        double c = (5.0/9.0) * ( f - 32);
        return c ;
    }
}
