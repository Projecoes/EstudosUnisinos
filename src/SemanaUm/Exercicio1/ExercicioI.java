package SemanaUm.Exercicio1;

/* Crie um método que recebe uma matriz de double e retorna o maior valor da matriz.  */

public class ExercicioI {

    static double exercicioI(double[][] array) {
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maiorValor < array[i][j]) {
                    maiorValor = (int) array[i][j];
                }
            }
        }
        return maiorValor;
    }
}
