package exercicios;

/*
* Solicitar a idade de uma pessoa em dias
* informar na tela a idade em anos, meses e dias.
*/

import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converte Dias em dd/mm/aaaa");
        System.out.println("Dias: ");

        int dias = verificarDias(input);
        LocalDate r = converterDias(dias);

        int dia = r.getDayOfMonth();
        int mes = r.getMonthValue();
        int ano = r.getYear();

        System.out.printf("Data aproximada: %02d/%02d/%04d\n", dia, mes, ano);


    }

    private static int verificarDias(Scanner input) {
        int dias = 0;
        while (true) {
            if (!input.hasNextInt()) {
                System.out.println("Digite um número valido! ");
                input.next();
                continue;
            }

            dias = input.nextInt();

            if (dias >= 70000) {

                System.out.println("Este valor é muito alto, Digite um número valido. ");
                continue;
            }
            if (dias <= 0) {

                System.out.println("Digite um numero maior que 0! ");
                continue;
            }
            return dias;


        }

    }

    private static LocalDate converterDias(int dias) {

        LocalDate dataBase = LocalDate.of(0, 1, 1);
        LocalDate dataFinal = dataBase.plusDays(dias);

        return dataFinal;
    }
}
