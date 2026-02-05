package exercicios;

/*
* Um circuito elétrico é composto de duas resistências R1 e R2 em paralelo
* e ambas em sequência de uma resistência R3.
* Faça um algoritmo para calcular a resistência equivalente desse circuito.
*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double r1 = lerResistenciaValida(input, "R1");
        double r2 = lerResistenciaValida(input, "R2");
        double r3 = lerResistenciaValida(input, "R3");
        calculaResistenciaCircuito(r1, r2, r3);

        input.close();
    }
    private static double lerResistenciaValida(Scanner input, String descricao){

        boolean valido;
        double resist = 0;

        do {
            System.out.println("Digete o valor de " + descricao + ":");

            if (!input.hasNextDouble()){
                System.out.println("Digite um valor valido!" );
                input.next();
                valido = false;
                continue;
            }
            resist = input.nextDouble();
            valido = resist > 0;

            if (!valido){
                System.out.println("Digite um numero positivo! ");
            }
        }while(!valido);
        return resist;
    }
    private static double calculaResistenciaCircuito(double r1, double r2, double r3){
        double resistCircuito = (r1 * r2) / (r1 + r2) + r3;
        System.out.println("A resistencia do circuito é: " +resistCircuito);
        return resistCircuito;
    }
}
