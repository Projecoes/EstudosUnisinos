package SemanaUm.Exercicio1;

/* Crie um método que recebe um array bidimensional de double e retorna a quantidade
de elementos deste array. */

public class ExercicioG {

    public static void exercicioG(double[][] array){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                contador++;
            }
            System.out.println();
        }
        System.out.println("Quantidade de elementos na matriz: " + contador);
    }
}
