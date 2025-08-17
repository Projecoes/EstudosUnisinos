package SemanaUm.Exercicio1;

import static SemanaUm.Exercicio1.ExercicioA.exercicioA;
import static SemanaUm.Exercicio1.ExercicioB.exercicioB;
import static SemanaUm.Exercicio1.ExercicioC.exercicioC;
import static SemanaUm.Exercicio1.ExercicioD.exercicioD;
import static SemanaUm.Exercicio1.ExercicioE.exercicioE;
import static SemanaUm.Exercicio1.ExercicioF.exercicioF;
import static SemanaUm.Exercicio1.ExercicioG.exercicioG;
import static SemanaUm.Exercicio1.ExercicioH.exercicioH;
import static SemanaUm.Exercicio1.ExercicioI.exercicioI;
import static SemanaUm.Exercicio1.ExercicioJ.exercicioJ;
import static SemanaUm.Exercicio1.ExercicioK.exercicioK;
import static SemanaUm.Exercicio1.ExercicioL.exercicioL;
import static SemanaUm.Exercicio1.ExercicioM.exercicioM;

/*Crie uma classe chamada Principal. Nela, crie o método main. Neste método, chame
todos os métodos criados nos exercícios A até M */

public class Principal {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, -1, -1},
                {5, 5, 5, 5}
        };

        double[][] matrizDouble = {
                {2.5, 5.6, 76.3, 98.0},
                {7.9, 4.4, 1.0, 19.4},
                {3.4, 21.0, 12.6, 55.3}
        };

        exercicioA();
        System.out.println();
        exercicioB();
        System.out.println();
        exercicioC();
        System.out.println();
        exercicioD();
        System.out.println();
        exercicioE();
        System.out.println();
        exercicioF();
        System.out.println();
        exercicioG(matrizDouble);
        System.out.println();
        System.out.print(exercicioH(matrizDouble));
        System.out.print("O maior valor da matriz é: " + exercicioI(matrizDouble));
        System.out.println(exercicioJ(matriz));
        System.out.println("Média dos elementos é : " + exercicioK(matrizDouble));
        exercicioL();
        System.out.println();
        exercicioM(matriz);

    }
}
