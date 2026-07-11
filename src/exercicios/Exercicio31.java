package exercicios;

/*
 * Um posto está vendendo combustíveis com a segudoublee tabela de descontos:
 * Álcool Até 25 litros, desconto de 2% por litro
 * Acima de 25 litros, desconto de 4% por litro
 * Gasolina Até 25 litros, desconto de 3% por litro
 * Acima de 25 litros, desconto de 5% por litro
 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
 * (codificado da segudoublee forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
 * pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,70 e o preço do litro
 * do álcool é R$ 1,90.
 */

import java.util.Scanner;

public class Exercicio31 {

    private static final String MSG_INICIAL = "Litros: ";

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double litros = validarNum(input);
        double valor = calculoDesconto(litros, input);
    }

    private static double validarNum(Scanner input) {
        boolean validar = true;
        double num = 0;

        do {
            System.out.print(MSG_INICIAL);

            if (!input.hasNextDouble()) {
                System.out.println("Digite um numero valido! ");
                validar = false;
                continue;
            }
            num = input.nextDouble();
            validar = true;
            if (num <= 0) {
                System.out.println("Digite um numero maior que zero");
                validar = false;
            }
        } while (!validar);
        return num;
    }
    private static double GeA(Scanner input) {
        boolean gasolinaealcool = true;
        double ga = 0;
        do {
            System.out.println("1 (Gasolina) / 2 (Alcool)");
            ga = validarNum(input);
            if (ga <= 0 || ga > 2) {
                System.out.println("Digite 1 ou 2!");
                input.next();
                gasolinaealcool = false;
            }
        } while (!gasolinaealcool);
        return ga;
    }
    private static double calculoDesconto(double litros, Scanner input) {
        double desconto = 0;
        double gea = GeA(input);
        double total = 0;
        if (gea == 1) {
            if (litros <= 25) {
                desconto = (litros * 2.70) * 3 / 100;
                total = (litros * 2.70) - desconto;
            } else {
                desconto = (litros * 2.70) * 5 / 100;
                total = (litros * 2.70) - desconto;
            }
        } else {
            if (litros <= 25) {
                desconto = (litros * 1.90) * 2 / 100;
                total = (litros * 1.90) - desconto;
            } else {
                desconto = (litros * 1.90) * 4 / 100;
                total = (litros * 1.90) - desconto;
            }
        }System.out.printf("R$ %.2f%nDesconto(s) R$ %.2f", total, desconto);
        return total;
    }
}

