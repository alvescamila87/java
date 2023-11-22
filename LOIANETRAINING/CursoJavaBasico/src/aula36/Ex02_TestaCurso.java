package aula36;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02_TestaCurso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Ex02_Curso curso = new Ex02_Curso();
        System.out.println("Informe o nome do curso: ");
        curso.setNome(entrada.nextLine());



    }
}
