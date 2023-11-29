
package aula09_metodos.sa;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Product {
    
    public static void login() {
        
        Scanner keyboard = new Scanner(System.in);
        
        String usernameDataBase = "admin";
        String passwordDataBase = "123456";
        
        String username;
        String password;  
        
        int option = 1;
        
        do {
            
            System.out.println();
            System.out.print("Type your username: ");
            username = keyboard.next();
            
            System.out.println();
            System.out.print("Type your password: ");
            password = keyboard.next();
            keyboard.nextLine();
            
            if(username.equals(usernameDataBase) && password.equals(passwordDataBase)) {
                
                System.out.println();
                System.out.println("Welcome to the Product Store");
                System.out.println();
                
                option = 1;
                
                showMenu(); 
                                
            } else {
                
                System.out.println();
                System.out.println("[ERROR] Invalid username and/or password!");
                System.out.println();
                System.out.println("Would you like to try again?");
                System.out.println("[1] EXIT");
                System.out.println("[2] TRY AGAIN");
                System.out.println();
                
                System.out.print("Type an option: ");
                option = keyboard.nextInt(); 
                keyboard.nextLine();
                
                if (option == 1) {
                    
                    System.out.println();
                    System.out.println("Thanks for coming...");
                    System.out.println("BYE-BYE");
                    System.out.println();
                }
                   
                
            }
            
        } while(option == 2);
        
    }
    
    public static int showMenu() {
        
        Scanner keyboard = new Scanner(System.in);
        
        int optionMenu;
        
        System.out.println();
        System.out.println("---------------------- MENU ----------------------");
        System.out.println();
        System.out.println("""
                           [1] Insert product 
                           [2] Update product 
                           [3] Remove product 
                           [4] Display products 
                           [5] Print products 
                           [6] Sort products by ranking 
                           [7] Add inventory 
                           [8] Remove inventory 
                           [9] Exit 
                           """);
        System.out.println("--------------------------------------------------");
        System.out.println();
        
        System.out.println("Type an option: ");
        optionMenu = keyboard.nextInt();
                
        return optionMenu;         
        
        
    }
    
    public static void insertProduct() {
        
        int countProduct=0;
        String[] tableProducts = new String[50];
        String[] tableRankingProducts = new String[50];
        String descriptionProduct = "";
        String rankingProduct = "";
        
        Scanner keyboard = new Scanner(System.in);
               
        while("".equals(descriptionProduct)) {
            
            System.out.println("Type the product description: ");
            descriptionProduct = keyboard.next();
            
            if(!"".equals(descriptionProduct)) {
                
                tableProducts[countProduct] = descriptionProduct;
                break;
                
            } else {
                System.out.println("[ERROR] There is no description product. Try again.");
            }
                      
        }
        
        while("".equals(rankingProduct)) {
            
            System.out.println("[A] Gold product");
            System.out.println("[B] Premium product");
            System.out.println("[C] Regular product");
            System.out.println("");
            System.out.println("Type the ranking product: ");
            rankingProduct = keyboard.next();
            
            if(!"".equals(rankingProduct)) {
                
                tableRankingProducts[countProduct] = rankingProduct;
                countProduct++;
                break;
                
            } else {
                System.out.println("[ERROR] There is no ranking product. Try again.");
            }
                      
        }     
                
    }
    
    public static void main(String[] args) {
                      
        login();
        
        int option;
        
        
        do {
            option = showMenu();
            
            switch (option) {
                
                case 1: 
                    insertProduct();
                    break;
                case 2:
                    //
                    break;
                default:
                    System.out.println("[ERROR] Invalid option. Try again!");
                
            }
            
        } while(option != 9);
        
        
     
                
    }
    
    
}
