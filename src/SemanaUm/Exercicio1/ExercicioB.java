package SemanaUm.Exercicio1;
/*Crie um método chamado exercicio1b, que retorna o array de inteiros abaixo:

0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81  */

public class ExercicioB {
    public static void exercicioB(){
        int[][] array = new int[5][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j * j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

