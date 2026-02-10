package exercicios;

/*
* Uma loja vende seus produtos no sistema entrada mais duas prestações, sendo a entrada
* maior do que ou igual às duas prestações, as quais devem ser iguais, inteiras e as maiores
* possíveis. Por exemplo, se o valor da mercadoria for R$ 270,00, a entrada e as duas
* prestações são iguais a R$ 90,00; se o valor da mercadoria for R$ 302,75, a entrada é de
* R$ 102,75 e as duas prestações são a iguais a R$ 100,00. Escreva um programa que
* receba o valor da mercadoria e forneça o valor da entrada e das duas prestações, de
* acordo com as regras acima. Observe que uma justificativa para a adoção desta regra é
* que ela facilita a confeção e o consequente pagamento dos boletos das duas prestações.
*/

import java.util.Scanner;

public class Exercicio21{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        calcularEntrada(input);

        input.close();
    }
    private static double lerNumeroValido (Scanner input){
        boolean valido;
        double valor = 0;

        do {

            System.out.print("Digite o valor do produto:");

            if (!input.hasNextDouble()){
                System.out.println("Digite um número valido!" );
                input.next();
                valido = false;
            }else{
                valor = input.nextDouble();
                valido = valor > 0;

                if(!valido){
                    System.out.println("Digite um número maior que 0!");
                }
            }


        }while (!valido);
        return valor;
    }
    private static void calcularEntrada(Scanner input){

        double valor = lerNumeroValido(input);

        int prestacao = (int) (valor / 3);
        double entrada = valor - (prestacao * 2 );  //pega o valor da prestação inteira e subtrai com o valor total e retorna a entreda... ok!

        System.out.printf("Valor da entrada: %.2f\nValor das 2 prestações: %d" , entrada , prestacao);
    }
}