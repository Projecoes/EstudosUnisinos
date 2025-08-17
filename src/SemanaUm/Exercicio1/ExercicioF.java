package SemanaUm.Exercicio1;

import java.util.Random;
import java.util.Scanner;

/*: Crie um método que retorna uma matriz de inteiros com números aleatórios positivos
menores que 100. O tamanho da matriz deve ser solicitado pelo teclado dentro do método. */

public class ExercicioF {

    static void exercicioF() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro numero da matriz: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Digite o segundo numero da matriz: ");
        int segundoNumero = sc.nextInt();

        int[][] matriz = new int[primeiroNumero][segundoNumero];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

