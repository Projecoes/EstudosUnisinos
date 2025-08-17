package SemanaUm.Exercicio1;

/*Crie um método chamado exercicio1c, que retorna o array de inteiros abaixo:

0 0 0 0 0 0
1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3 3
4 4 4 4 4 4
5 5 5 5 5 5 */

public class ExercicioC {

    public static void exercicioC() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
