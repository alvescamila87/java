
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex08_DesafioAviao {
    
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        
        int contadorAssentosCase1 = 0;
        int contadorAssentosCase2 = 0;
        boolean primeiraClasseLotada = false;
        boolean classeEconomicaLotada = false;
        int opcao = 0;
        int numeroAssento;
        String[] vetorStatusAssentoAviao2 = new String[10];
        boolean[] vetorStatusAssentoAviao1 = new boolean[10];
        double[] vetorPrecoAssentoAviao = new double[10];
        double[] vetorPrecoVendidoAssentoAviao = new double[10];

        double totalAeronave = 0;
        int qtdPrimeiraClasseReservado = 0;
        int qtdClasseEconomicaReservado = 0;
        
        // iniciar vetores preenchendo false para assentos livres
        for (int i = 0; i < 10; i++) {
            vetorStatusAssentoAviao1[i] = false;
            
            if(i < 5) {
                vetorStatusAssentoAviao1[i] = false;
                    if(vetorStatusAssentoAviao1[i] == false) {
                       vetorStatusAssentoAviao2[i] = "Livre";
                    }
                vetorPrecoAssentoAviao[i] = 1399.90;
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
                    
                    if(!primeiraClasseLotada) {
                        
                        System.out.println();
                        System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE - PRIMEIRA CLASSE");  
                        System.out.println();
                        
                        // imprimir assentos 
                        for (int i = 0; i < 5; i++) {
                            
                            System.out.printf("- Assento %s | Status: %s | R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
                                                      
                        }
                        
                        // lógica
                        for (int j = 0; j < 5; j++) {
                                                       
                            System.out.println();
                            System.out.print("Informe o número do assento que deseja reservar: ");
                            numeroAssento = entrada.nextInt();
                            
                            if(numeroAssento >= 0 && numeroAssento <= 4) {
                                
                                if(vetorStatusAssentoAviao1[numeroAssento] != true) {
                                    
                                    vetorStatusAssentoAviao1[numeroAssento] = true;
                                    vetorStatusAssentoAviao2[numeroAssento] = "Reservado";
                                    vetorPrecoVendidoAssentoAviao[numeroAssento] = vetorPrecoAssentoAviao[numeroAssento];
                                    contadorAssentosCase1++;
                                        if(contadorAssentosCase1 == 5) {
                                            primeiraClasseLotada = true;
                                        }   
                                    System.out.printf("Assento %s reservado com sucesso! \n", numeroAssento);
                                    break;
                                    
                                } else {
                                    
                                    System.out.println("[ERRO] Número de assento já reservado, tente novamente! \n");
                                    System.out.println();
                                    
                                }                                     
                                    
                            } else {
                                   
                                    System.out.println("[ERRO] Número de assento inválido, tente novamente! \n");
                                    System.out.println();
                                    
                            }                         
                            
                        }
                       
                    } else if(!classeEconomicaLotada) {
                        
                        System.out.println();
                        System.out.println("[ANTEÇÃO] PRIMEIRA CLASSE LOTADA! \n");
                        System.out.println("[ANTEÇÃO] Possibilidade de reserva de assento na Classe Econômica! \n");
                        System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE - CLASSE ECONÔMICA");
                        System.out.println();
                        
                        // imprimir assentos 
                        for (int i = 5; i < 10; i++) {
                            
                            System.out.printf("- Assento %s | Status: %s | R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
                           
                        }
                        
                        // lógica
                        for (int j = 5; j < 10; j++) {
                                                       
                            System.out.println();
                            System.out.print("Informe o número do assento que deseja reservar: ");
                            numeroAssento = entrada.nextInt();
                            
                            if(numeroAssento >= 5 && numeroAssento <= 9) {
                                
                                if(vetorStatusAssentoAviao1[numeroAssento] != true) {
                                    
                                    vetorStatusAssentoAviao1[numeroAssento] = true;
                                    vetorStatusAssentoAviao2[numeroAssento] = "Reservado";
                                    vetorPrecoVendidoAssentoAviao[numeroAssento] = vetorPrecoAssentoAviao[numeroAssento];
                                    contadorAssentosCase1++;
                                        if(contadorAssentosCase2 == 5) {
                                            classeEconomicaLotada = true;
                                        } 
                                    System.out.printf("Assento %s reservado com sucesso! \n", numeroAssento);
                                    break;
                                    
                                } else {
                                    
                                    System.out.println("[ERRO] Número de assento já reservado, tente novamente! \n");
                                    System.out.println();
                                    
                                }                                     
                                    
                            } else {
                                    
                                    System.out.println();
                                    System.out.println("[ERRO] Número de assento inválido, tente novamente! \n");
                                    System.out.println();
                                    
                            }                         
                            
                            
                        }
                        
                        
                    } else {
                        
                        System.out.println();
                        System.out.println("[ERRO] Aeronave lotada!!! \n");
                        System.out.println();
                    }
                   
                   
                                                
                break;
                case 2:
                    
                    if(!classeEconomicaLotada) {
                        
                        System.out.println();
                        System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE - CLASSE ECONÔMICA");  
                        System.out.println();
                        
                        // imprimir assentos 
                        for (int i = 5; i < 10; i++) {
                            
                            System.out.printf("- Assento %s | Status: %s | R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i]);
                                                      
                        }
                        
                        // lógica
                        for (int j = 5; j < 10; j++) {
                                                       
                            System.out.println();
                            System.out.print("Informe o número do assento que deseja reservar: ");
                            numeroAssento = entrada.nextInt();
                            
                            if(numeroAssento >= 5 && numeroAssento <= 9) {
                                
                                if(vetorStatusAssentoAviao1[numeroAssento] != true) {
                                    
                                    vetorStatusAssentoAviao1[numeroAssento] = true;
                                    vetorStatusAssentoAviao2[numeroAssento] = "Reservado";
                                    vetorPrecoVendidoAssentoAviao[numeroAssento] = vetorPrecoAssentoAviao[numeroAssento];
                                    contadorAssentosCase2++;
                                        if(contadorAssentosCase2 == 5) {
                                            classeEconomicaLotada = true;
                                        }   
                                    System.out.printf("Assento %s reservado com sucesso! \n", numeroAssento);
                                    break;
                                    
                                } else {
                                    
                                    System.out.println("[ERRO] Número de assento já reservado, tente novamente! \n");
                                    System.out.println();
                                    
                                }                                     
                                    
                            } else {
                                    
                                    System.out.println();
                                    System.out.println("[ERRO] Número de assento inválido, tente novamente! \n");
                                    System.out.println();
                                    
                            }                         
                            
                        }
                       
                    } else if(!primeiraClasseLotada) {
                        
                        System.out.println();
                        System.out.println("[ATEÇÃO] CLASSE ECONÔMICA LOTADA! \n");
                        System.out.println("[ATEÇÃO] OFERTA DE 50% OFF!!! \n");
                        System.out.println("[ATEÇÃO] Possibilidade de reserva de assento na Primeira Classe! \n");
                        System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE - PRIMEIRA CLASSE");
                        System.out.println();
                        
                        // imprimir assentos 
                        for (int i = 0; i < 5; i++) {
                            
                            System.out.printf("- Assento %s | Status: %s | R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoAssentoAviao[i + 5]);
                           
                        }
                        
                        // lógica
                        for (int j = 0; j < 5; j++) {
                                                       
                            System.out.println();
                            System.out.print("Informe o número do assento que deseja reservar: ");
                            numeroAssento = entrada.nextInt();
                            
                            if(numeroAssento >= 0 && numeroAssento <= 4) {
                                
                                if(vetorStatusAssentoAviao1[numeroAssento] != true) {
                                    
                                    vetorStatusAssentoAviao1[numeroAssento] = true;
                                    vetorStatusAssentoAviao2[numeroAssento] = "Reservado";
                                    vetorPrecoVendidoAssentoAviao[numeroAssento] = vetorPrecoAssentoAviao[j + 5];
                                    contadorAssentosCase1++;
                                        if(contadorAssentosCase1 == 5) {
                                            primeiraClasseLotada = true;
                                        } 
                                    System.out.printf("Assento %s reservado com sucesso! \n", numeroAssento);
                                    break;
                                    
                                } else {
                                    
                                    System.out.println("[ERRO] Número de assento já reservado, tente novamente! \n");
                                    System.out.println();
                                    
                                }                                     
                                    
                            } else {
                                    
                                    System.out.println();
                                    System.out.println("[ERRO] Número de assento inválido, tente novamente! \n");
                                    System.out.println();
                                    
                            }                         
                            
                            
                        }
                        
                        
                    } else {
                        
                        System.out.println();
                        System.out.println("[ERRO] Aeronave lotada!!! \n");
                        System.out.println();
                    }
                    
                    
                break;
                case 3:
                    
                    System.out.println("");
                    System.out.println("RELATÓRIO DE ASSENTOS DA AERONAVE");
                    System.out.println("");
                    
                    for (int i = 0; i < 10; i++) {
                        
                        if (i < 5) {
                            
                            System.out.printf("Assento %s -- Primeira classe -- Status: %s -- R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoVendidoAssentoAviao[i]);

                        }
                        
                        if (i >= 5) {

                            System.out.printf("Assento %s -- Classe econômica-- Status: %s -- R$%.2f \n", i, vetorStatusAssentoAviao2[i], vetorPrecoVendidoAssentoAviao[i]);
                            
                        }
                        
                        if(vetorPrecoVendidoAssentoAviao[i] != 0){
                            totalAeronave = totalAeronave + vetorPrecoVendidoAssentoAviao[i];
                        }
                    }
                    System.out.printf("- TOTAL VENDIDO AERONAVE R$%.2f \n", totalAeronave);
                    
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
