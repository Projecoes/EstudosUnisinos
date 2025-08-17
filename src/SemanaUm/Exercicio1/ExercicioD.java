package SemanaUm.Exercicio1;

/*Crie um método chamado exercicio1d, que retorna o array de inteiros abaixo:
 -1 -1 -1 -1 -1 -1
 0   0  0  0  0  0  -1 -1 -1 -1 -1 -1
 0   0  0  0  0  0  -1 -1 -1 -1 -1 -1
 0   0  0  0  0  0  -1 -1 -1 -1 -1 -1
 0   0  0  0  0  0  -1 -1 -1 -1 -1 -1 */

public class ExercicioD {

    static void exercicioD() {
        int[][] array = new int[9][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i % 2 == 0 ? 1 : 0;
                /*if (i % 2 ==0) {
                    array[i][j] = 1;
                }else{
                    array[i][j] = 0;
                }*/
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
