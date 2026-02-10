package exercicios;

import java.time.Month;
import java.util.Scanner;

/*
* Escreva um programa que leia o número equivalente ao mês e imprima a quantidade de dias deste mês.
*/
public class Exercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        mesEmDias(sc);

        sc.close();
    }
    private static int inputMonthTrue(Scanner sc){
        boolean valido;
        int month = 0;

        do {
            System.out.print("Digite o mês: ");
            if (!sc.hasNextInt()){
                System.out.println("Digite um número valido! ");
                sc.next();
                valido = false;
                continue;
            }
                month = sc.nextInt();
                valido = month > 0 && month < 13;

            if (!valido){
                System.out.println("Digite um mês entre 1 e 12");
            }
        }while (!valido);

        return month;
    }
    private static void mesEmDias(Scanner sc){
        int month = inputMonthTrue(sc);
        Month mes = Month.of(month);
        int dias = mes.length(false);
        System.out.println("Dias: " + dias);
    }
}
