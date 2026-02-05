package exercicios;

/*
* Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é
* suficientemente longa. Assumindo que seja possível medir sua sombra e a do prédio no
* chão, e que você lembre da sua altura, faça um programa para ler os dados necessários e calcular a altura do prédio.
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        calculaAlturaPredio(input);

        input.close();

    }
    private static double lerValorValido(Scanner input, String descricao){

        double valor = 0;
        boolean valido;

        do {
            System.out.print("Digite valor de " + descricao + ":");
            if (!input.hasNextDouble()){
                System.out.println("Digite um número valido! ");
                input.next();
                valido = false;
                continue;
            }else{
               valor = input.nextDouble();
               valido = valor > 0;
               if (!valido){
                   System.out.println("Digite um número maior que 0! ");
               }
            }
        }while (!valido);
        return valor;
    }
    private static double calculaAlturaPredio(Scanner input){

        double minhaAltura = lerValorValido(input,"sua altura (m)");
        double minhaSombra = lerValorValido(input, "sua sombra (m)");
        double predioSombra = lerValorValido(input, "sombra do prédio (m)");
        double alturaPredio = (minhaAltura * predioSombra) / minhaSombra;

        System.out.printf("A altura do prédio é %.2f metros.%n", alturaPredio);

        return alturaPredio;
    }
}
