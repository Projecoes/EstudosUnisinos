package SemanaUm.Exercicio1;
/*: Escreva um método que leia 10 valores double do teclado e armazene-os em uma
matriz de dimensões 2x5. Seu método deve retornar esta matriz. */

import java.util.Scanner;

public class ExercicioE {

    public static double[][] exercicioE() {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[2][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("Digite o valor [%d][%d] da Matriz: ", i, j);
                double valor = sc.nextDouble();
                matriz[i][j] = valor;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        return matriz;
    }
}
