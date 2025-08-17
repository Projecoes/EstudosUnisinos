package SemanaUm.Exercicio1;

/* Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os
elementos da matriz.  */

public class ExercicioJ {

    static int exercicioJ(int[][] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                soma += array[i][j];
            }
        }
        return soma;
    }
}
