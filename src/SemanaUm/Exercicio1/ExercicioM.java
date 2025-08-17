package SemanaUm.Exercicio1;

/*Crie um método que recebe uma matriz de inteiros e retorna um array unidimensional
que contém apenas os elementos positivos desta matriz. */

public class ExercicioM {

    static void exercicioM(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
