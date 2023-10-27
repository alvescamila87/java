package aula21;

public class ForEach2_Matriz {

    public static void main(String[] args) {

        // arrays multidimensionais

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 6;
        notasAlunos[2][1] = 5.8;
        notasAlunos[2][2] = 8;
        notasAlunos[2][3] = 6.3;

        for (double[] notaAluno : notasAlunos) {
            for (double nota : notaAluno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}
