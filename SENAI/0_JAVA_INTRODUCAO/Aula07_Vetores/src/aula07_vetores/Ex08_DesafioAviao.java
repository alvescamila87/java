
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex08_DesafioAviao {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        
        int opcao = 0;
        int numeroAssento = Integer.MAX_VALUE;
        String[] vetorStatusAssentoAviao2 = new String[10];
        boolean[] vetorStatusAssentoAviao1 = new boolean[10];
        double[] vetorPrecoAssentoAviao = new double[10];
        double subtotalPrimeiraClasse = 0;
        double subtotalClasseEconomica = 0;
        double totalAeronave = 0;
        int qtdPrimeiraClasseReservado = 0;
        int qtdClasseEconomicaReservado = 0;
        
        // iniciar vetores
        for (int i = 0; i < 10; i++) {
            vetorStatusAssentoAviao1[i] = false;
            
            if(i < 5) {
                vetorStatusAssentoAviao1[i] = false;
                    if(vetorStatusAssentoAviao1[i] == false) {
                       vetorStatusAssentoAviao2[i] = "Livre";
                    }
                vetorPrecoAssentoAviao[i] = 1299.90;
                System.out.printf("Assento %s -- Primeira classe -- Status: %s -- R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
            }
            if(i >= 5) {
                vetorStatusAssentoAviao1[i] = false;
                if(vetorStatusAssentoAviao1[i] == false) {
                       vetorStatusAssentoAviao2[i] = "Livre";
                    }
                vetorPrecoAssentoAviao[i] = 699.90;
                System.out.printf("Assento %s -- Classe econômica-- Status: %s -- R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
            }
            
        }
                
        System.out.println();
        System.out.println();
                                
        while(opcao != 4) {
    
            System.out.println("COMPANHIA AÉREA - SISTEMA AUTOMATIZADO DE RESERVAS \n");
            System.out.println("");
            System.out.println("");
            System.out.println("[1] - Primeira classe");
            System.out.println("[2] - Classe econômica");
            System.out.println("[3] - Relatório de assentos");
            System.out.println("[4] - Sair do programa");
            System.out.println();
            System.out.print("Informe a opção da classe que deseja comprar: ");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    
                    System.out.println();
                    System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE - PRIMEIRA CLASSE");
                    System.out.println();
                    System.out.println();
                   
                    for (int i = 0; i < 5; i++) {
                       
                        System.out.printf("- Assento %s Status: %s R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
                        System.out.println("");
                    }
                    
                    System.out.print("Informe o número do assento que deseja comprar: ");
                    numeroAssento = entrada.nextInt();                    
              
                        if (numeroAssento < 0 || numeroAssento > 5) {

                            System.out.println("[ERRO] Opção inválida! Tente novamente.");
                            System.out.println("");

                        } else {
                            

                            vetorStatusAssentoAviao1[numeroAssento] = true;

                            if (vetorStatusAssentoAviao1[numeroAssento] == true) {

                                vetorStatusAssentoAviao2[numeroAssento] = "Reservado";
                                
                                System.out.println("");
                                System.out.printf("- Assento %s Status: %s - Valor a pagar R$%.2f \n", numeroAssento, vetorStatusAssentoAviao2[numeroAssento], vetorPrecoAssentoAviao[numeroAssento]);
                                System.out.println("");
                            }

                            break;
                        }
                                                
                break;
                case 2:
                    
                    System.out.println();
                    System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE - CLASSE ECONÔMICA");
                    System.out.println();
                    System.out.println();
                   
                    for (int i = 5; i < 10; i++) {
                       
                        System.out.printf("- Assento %s Status: %s R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
                        System.out.println("");
                    }
                    
                    System.out.print("Informe o número do assento que deseja comprar: ");
                    numeroAssento = entrada.nextInt();
                    
                    
                        if (numeroAssento < 5 || numeroAssento > 10) {

                            System.out.println("[ERRO] Assento inválido!");
                            System.out.println("");

                        } else {

                            vetorStatusAssentoAviao1[numeroAssento] = true;

                            if (vetorStatusAssentoAviao1[numeroAssento] == true) {
                                
                                vetorStatusAssentoAviao2[numeroAssento] = "Reservado";
                                
                                System.out.println("");
                                System.out.printf("- Assento %s Status: %s - Valor a pagar R$%.2f \n", numeroAssento, vetorStatusAssentoAviao2[numeroAssento], vetorPrecoAssentoAviao[numeroAssento]);
                                System.out.println("");
                            }

                            break;
                        }  
                    
                break;
                case 3:
                    
                    System.out.println("");
                    System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE");
                    System.out.println("");
                    
                    for (int i = 0; i < 10; i++) {
                        
                        if (i < 5) {
                            
                            System.out.printf("Assento %s -- Primeira classe -- Status: %s -- R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
                            subtotalPrimeiraClasse = subtotalPrimeiraClasse + vetorPrecoAssentoAviao[i];
                            
                            if(vetorStatusAssentoAviao1[i] == true) {
                                qtdPrimeiraClasseReservado++;
                            }
                        }
                        
                        if (i >= 5) {

                            System.out.printf("Assento %s -- Classe econômica-- Status: %s -- R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
                            subtotalClasseEconomica = subtotalClasseEconomica + vetorPrecoAssentoAviao[i];
                            
                            if(vetorStatusAssentoAviao1[i] == true) {
                                qtdClasseEconomicaReservado++;
                            }
                        }
                        
                        totalAeronave = subtotalPrimeiraClasse + subtotalClasseEconomica;
                    }
                    System.out.printf("- SUBTOTAL PRIMEIRA CLASSE: Qtd assentos reservados %s --> R$%.2f \n", qtdPrimeiraClasseReservado, subtotalPrimeiraClasse);
                    System.out.printf("- SUBTOTAL CLASSE ECONÔMICA: Qtd assentos reservados %s --> R$%.2f \n", qtdClasseEconomicaReservado, subtotalClasseEconomica);
                    System.out.printf("- TOTAL AERONAVE R$%.2f \n", totalAeronave);
                    
                break;
                case 4:
                    
                    System.out.println("PROGRAMA FINALIZADO");
                    System.out.println("VOLTE SEMPRE!");  
                    
                break;
                default: 
                    
                    System.out.print("[ERRO] Opção inválida. Tente novamente");
            }

        }
        
    }
    
 
 }

