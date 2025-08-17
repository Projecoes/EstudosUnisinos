package SemanaUm.Exercicio1;
/* Crie um método chamado exercicioA, que retorna o array de inteiros abaixo:

0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9 */

public class ExercicioA {

    public static void exercicioA() {
        int[][] array = new int[3][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}