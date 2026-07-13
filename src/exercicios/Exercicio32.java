/*
No Futebol Americano, usa-se o Quarterback Rating como um índice que indica o
desempenho do quarterback (quando maior, melhor). Ele é calculado como indicado a
seguir: Calcula-se o percentual de passes completados em relação aos passes tentados
pelo quarterback. Deste valor subtrai-se 0,3 e divide-se por 0,2. Este valor não deve ser
maior que 2,375 ou menor que 0 (caso seja, ajusta-se o valor para 2,375 ou 0,
respectivamente).
Em seguida, calcula-se a razão de jardas passadas pela quantidade de passes tentados.
Deste valor, subtrai-se 3 e divide-se por 4. Novamente, este valor não deve ser maior que
2,375 ou menor que 0 (caso seja, procede-se como no caso anterior).
Agora, calcula-se a razão de passes para touchdows pelo número de passes tentados.
Divide-se o valor por 0,05. Mais uma vez, este valor não deve ser maior que 2,375 ou
menor que 0 (caso seja, procede-se como de costume).
Então, calcula-se a razão entre passes interceptados e o número de passes tentados. Deste
valor, subtrai-se 0,095 e divide-se o resultado por 0,04. Como de praxe, este valor não
deve ser maior que 2,375 ou menor que 0 (caso seja, atua-se como explicado).
O quarterback rating é calculando somando-se as quatro parcelas anteriores,
multiplicando a soma por 100 e dividindo-se o produto por 6.
Escreva um programa, que leia o número de passes tentados, o número de passes
completos, o número de jardas passadas, o número de passes para touchdown e o número
de passes interceptados e informe o QB Rating do quarterback.
*/

package exercicios;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double passesTotal =  Validarnum(input, "passes tentados");
        double passesConcluidos = Validarnum(input, "passes concluidos");
        double jardas = Validarnum(input, "jardas");
        double touchdown =  Validarnum(input, "passes touchdown");
        double interceptados =  Validarnum(input, "passes interceptados");
        double porcentagem = calcularPorcentagem( passesTotal, passesConcluidos);

        double caljarads = calcularJardas(passesTotal, passesConcluidos);
        double caltouchdows =  calcularJardas(passesTotal, passesConcluidos);
        double calinter = calcularInterceptados(passesTotal, passesConcluidos);
        double calporcentagem = calcularPorcentagem(interceptados, porcentagem);
        double total = caljarads + caltouchdows + calinter + calporcentagem;

        System.out.println("1 - jardas: " + caljarads +
                "\n2 - touchdown: " + caltouchdows +
                "\n3 - interceptados: " + calinter +
                "\n4 - porcentagem: " + calporcentagem +
                "\nTotal: " + total);

    }
    private static double Validarnum (Scanner input, String descricao){
        boolean valido;
        double num = 0;

        do {
            System.out.print("Digite (" + descricao + "): ");
            if (!input.hasNextDouble()) {
                System.out.println("Digite um número valido");
                input.next();
                valido = false;
                continue;
            }

            num = input.nextDouble();
            valido = true;

            if (num < 0){
            System.out.println("Dígite um número maior que zero!");
            valido = false;
            }
        }while (!valido);
        return num;
   }
   private static double calcularPorcentagem (double passesTotal,  double passesConcluidos){
        double num = (((passesConcluidos * passesTotal) / 100) - 0.3) /0.2; //calculo é feito 45*100/100
       if (num < 0){
           num = 0;
       }else if (num >2.375 ){
           num = 2.375;
       }
       return num;
   }
    private static double calcularJardas (double Jardas,  double passesTotal){
        double num = ((Jardas / passesTotal) - 3) /4; //calculo é feito 45*100/100
        if (num < 0){
            num = 0;
        }else if (num >2.375 ){
            num = 2.375;
        }
        return num;
    }
    private static double calcularTouchdown (double touchdown, double passesTotal){
        double num = (touchdown / passesTotal) / 0.05; //calculo é feito 45*100/100
        if (num < 0){
            num = 0;
        }else if (num >2.375 ){
            num = 2.375;
        }
        return num;
    }
    private static double calcularInterceptados (double interceptados, double passesTotal){
        double num = ((interceptados / passesTotal) - 0.095) / 0.04 ; //calculo é feito 45*100/100
        if (num < 0){
            num = 0;
        }else if (num >2.375 ){
            num = 2.375;
        }
        return num;
    }
}