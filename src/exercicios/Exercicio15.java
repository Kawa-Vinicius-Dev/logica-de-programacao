package exercicios;

/*
 * Em uma cidade se deseja sincronizar os semáforos. Com isto, quando um semáforo abre
 * (fica verde), os veículos que nele estavam parados tendem a encontrar os próximos
 * semáforos também abertos. Para que isto seja feito, os próximos semáforos precisam
 * abrir um pouco depois, dependendo da velocidade permitida na via e da distância entre
 * eles. Assim, ao abrir o semáforo, um veículo começa a acelerar até atingir a velocidade
 * permitida, que mantém até chegar ao próximo semáforo, levando um certo tempo para
 * percorrer essa distância. Para que encontre o próximo semáforo aberto, este deve abrir
 * um pouco antes da chegada do veículo (por ex: 3 segundos antes). Faça assim um
 * algoritmo que informe quanto tempo depois um semáforo deve abrir, dada as seguintes
 * informações:
 * a. a distância desde o semáforo anterior
 * b. a velocidade permitida da via
 * c. a aceleração típica dos carros
 */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calcula em quanto tempo o proximo semaforo abre! ");

        double velocidadeVia = lerValorValido(input, "da velocidade da via (m/s)");
        double aceleracaoDoCarro = lerValorValido(input, "da aceleração do carro (m/s²)");
        double distanciaFinal = verificarDistancia(input, velocidadeVia, aceleracaoDoCarro);
        double tempoAteSemaforo = tempoProximoSemaforo(velocidadeVia, aceleracaoDoCarro, distanciaFinal);
        tempoIdeal(tempoAteSemaforo);

        input.close();

    }

    private static double lerValorValido(Scanner input, String descricao) {

        boolean valido;
        double valor = 0;

        do {

            System.out.print("Digite o valor " + descricao + ": ");

            if (!input.hasNextDouble()) {
                System.out.println("Digite um número valido! ");
                input.next();
                valido = false;
                continue;
            } else {
                valor = input.nextDouble();
                valido = valor > 0;

                if (!valido) {
                    System.out.println("Digite um valor maior que 0! ");
                }
            }

        } while (!valido);

        return valor;
    }

    private static double tempoAceleracao(double velocidadeVia, double aceleracaoDoCarro) {
        return velocidadeVia / aceleracaoDoCarro;
    }

    private static double espacoPercorridoAteVelocidadeMax(double velocidadeVia, double aceleracaoDoCarro) {
        return Math.pow(velocidadeVia, 2) / (2 * aceleracaoDoCarro);
    }

    private static double tempoPercursoConstante(double distanciaFinal, double velocidadeVia, double aceleracaoDoCarro) {
        double distanciaInicial = espacoPercorridoAteVelocidadeMax(velocidadeVia, aceleracaoDoCarro);
        return (distanciaFinal - distanciaInicial) / velocidadeVia;
    }

    private static double tempoProximoSemaforo(double velocidadeVia, double aceleracaoDoCarro, double distanciaFinal) { // tempoAteSemaforo1 e tempoAteSemaforo2
        return tempoAceleracao(velocidadeVia, aceleracaoDoCarro) + tempoPercursoConstante(distanciaFinal, velocidadeVia, aceleracaoDoCarro);
    }

    private static double verificarDistancia(Scanner input, double velocidadeVia, double aceleracaoDoCarro) {
        double distancia = 0;
        double distanciaMin = espacoPercorridoAteVelocidadeMax(velocidadeVia, aceleracaoDoCarro);

        do {
            distancia = lerValorValido(input, "da distância entre os semáforos (m) ");

            if (distancia < distanciaMin) {
                System.out.printf("A distância precisa ser no mínimo %.2f metros para atingir a velocidade máxima.%n ", distanciaMin);
            }
        } while (distancia < distanciaMin);
        return distancia;
    }

    private static final double ANTECEDENCIA_SEMAFORO = 3.0;

    private static void tempoIdeal(double tempoAteSemaforo) {
        double tempo = tempoAteSemaforo - ANTECEDENCIA_SEMAFORO;
        System.out.printf("O ideal é que o proximo semaforo abra com %.2f segundos apos sua partida.%n", tempo);
    }
}
