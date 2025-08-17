package SemanaUm.Exercicio1;

import java.util.Random;
import java.util.Scanner;

/*Crie um método que devolve uma matriz de caracteres lidos do teclado. O número de
linhas da matriz deve ser aleatório, entre 1 e 5, enquanto o número de colunas deve ser também
aleatório, porém, entre 1 e 3.  */

public class ExercicioL {

    static void exercicioL() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int linhas = random.nextInt(5) + 1;
        int colunas = random.nextInt(3) + 1;
        char[][] matriz = new char[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("Digite o valor [%d][%d] da Matriz: ", i, j);
                matriz[i][j] = sc.next().charAt(0);
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
