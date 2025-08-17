package SemanaUm.Exercicio1;
/* Crie um método que recebe um array bidimensional de double e retorna a média dos
valores deste array. */

public class ExercicioK {

    static String exercicioK(double[][] array) {
        int contadorElementos = 0;
        double soma = 0;
        double media;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                soma += array[i][j];
                contadorElementos++;
            }
        }
        media = soma / contadorElementos;
        return String.format("%.2f", media);

    }
}
