package aula04;

import java.util.Scanner;

public class Matrizes_Exe04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[][] matrizCompromissos = new String[31][24];

        boolean sair = false;
        byte opcao;

        while(!sair) {

            System.out.println("[1] - Para adicionar compromisso. ");
            System.out.println("[2] - Para verificar compromisso. ");
            System.out.println("[0] - Para sair. ");
            System.out.println("Digite uma das opções do menu: ");
            opcao = entrada.nextByte();

            switch (opcao) {
                case 1: // adicionar compromisso

                    boolean diaValido = false;
                    int dia = 0;

                    while (!diaValido) {
                        System.out.println("Informe com o dia do mês (1 a 31): ");
                        dia = entrada.nextInt();

                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("[ERRO] Dia inválido, tente novamente.");
                        }
                    }

                    boolean horaValida = false;
                    int hora = 0;

                    while(!horaValida) {
                        System.out.println("Informe a hora do compromisso (0 a 24)hs: ");
                        hora = entrada.nextInt();

                        if(hora >= 0 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("[ERRO] Hora inválida, tente novamente.");
                        }
                    }

                    dia--;
                    System.out.println("Informe a descrição do compromisso: ");
                    matrizCompromissos[dia][hora] = entrada.next();

                break;
                case 2: // verificar compromisso
                    diaValido = false;
                    dia = 0;

                    while (!diaValido) {
                        System.out.println("Informe com o dia do mês: ");
                        dia = entrada.nextInt();

                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("[ERRO] Dia inválido, tente novamente.");
                        }
                    }

                    horaValida = false;
                    hora = 0;

                    while(!horaValida) {
                        System.out.println("Informe a hora do compromisso: ");
                        hora = entrada.nextInt();

                        if(hora >= 0 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("[ERRO] Hora inválida, tente novamente.");
                        }
                    }

                    dia--;
                    System.out.println("O compromisso agendado é: ");
                    System.out.println(matrizCompromissos[dia][hora]);

                break;
                case 0:
                    sair = true;
                    System.out.println("FIM PROGRAMA!");
                break;
                default:
                    System.out.println("[ERRO] Opção de menu inválida. Tente novamente... ");
            }

        }
    }
}
