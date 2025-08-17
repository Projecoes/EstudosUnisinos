package SemanaUm.Exercicio1;

/*  Crie um método que recebe uma matriz de double e retorna um String de saída
para ela, com seus valores separados por um hífen, mas mantendo o formato da matriz. Por
exemplo, para a matriz de entrada abaixo:
O método deve retornar a String:
“2.5 - 5.6 - 76.3 - 98.0
7.9 - 4.4 - 1.0 - 19.4
3.4 - 21.0 - 12.6 - 54.3”*/

public class ExercicioH {

    public static String exercicioH(double[][] array) {
        StringBuilder retorno = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                retorno.append(array[i][j]);

                if (j < array[i].length - 1) {
                    retorno.append(" - ");
                }
            }
            if (i < array.length - 1) {
                retorno.append("\n");
            }
        }
        return retorno.toString();
    }
}



