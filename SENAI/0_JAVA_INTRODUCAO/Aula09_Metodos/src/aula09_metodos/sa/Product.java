package aula09_metodos.sa;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Product {

    private static int maxProducts = 50;
    private static int countProduct = 0;
    private static String[] tableProducts = new String[maxProducts];
    private static String[] tableClassificationProducts = new String[maxProducts];
    private static int[] tableInventoryProducts = new int[maxProducts];
    private static boolean findProduct = false;
    
    

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

            if (username.equals(usernameDataBase) && password.equals(passwordDataBase)) {

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

                System.out.print("Type an option above: ");
                option = keyboard.nextInt();
                keyboard.nextLine();

                if (option == 1) {

                    System.out.println();
                    System.out.println("Thanks for coming...");
                    System.out.println("BYE-BYE");
                    System.out.println();
                }

            }

        } while (option == 2);

    }

    public static void showMenu() {

        Scanner keyboard = new Scanner(System.in);

        Product products = new Product();

        int optionMenu;
        
        do {
            System.out.println();
            System.out.println("---------------------- MENU ----------------------");
            System.out.println();
            System.out.println("""
                           [1] Insert product 
                           [2] Update product 
                           [3] Remove product 
                           [4] Display all products 
                           [5] Display all products by sorting
                           [6] Display all products by classification
                           [7] Add inventory 
                           [8] Remove inventory 
                           [9] Exit 
                           """);
            System.out.println("--------------------------------------------------");
            System.out.println();

            System.out.println("Type an option from menu: ");
            optionMenu = keyboard.nextInt();

            switch (optionMenu) {

                case 1:
                    Product.insertProduct();
                    break;
                case 2:
                    Product.updateProduct();
                    break;
                case 3:
                    Product.removeProduct();
                    break;
                case 4:
                    Product.displayProducts();
                    break;
                case 5: 
                    Product.displaySortingProducts();
                    break;
                case 6:                     
                    break;
                case 7:
                    Product.addInventory();
                    break;
                case 8:
                    Product.removeInventory();
                    break;
                case 9:
                    System.out.println("THE END");
                    break;
                default:
                    System.out.println("[ERROR] Invalid option. Try again!");

            }

        } while (optionMenu != 9);
    }

    public static void insertProduct() {
        
        Product.displayProducts();

        String descriptionProduct = "";
        String classificationProduct = "";

        Scanner keyboard = new Scanner(System.in);

        while ("".equals(descriptionProduct)) {
            
            System.out.println();
            System.out.println("Type the product description: ");
            descriptionProduct = keyboard.next();

            if (!"".equals(descriptionProduct)) {

                Product.tableProducts[Product.countProduct] = descriptionProduct;
                Product.tableInventoryProducts[Product.countProduct] = 0;
                break;

            } else {
                System.out.println("[ERROR] There is no description product. Try again.");
            }

        }

        while ("".equals(classificationProduct)) {

            System.out.println();
            System.out.println("[A] Gold product");
            System.out.println("[B] Premium product");
            System.out.println("[C] Regular product");
            System.out.println("");
            System.out.println("Type the classification of the product: ");
            classificationProduct = keyboard.next();

            if (!"".equals(classificationProduct)) {

                Product.tableClassificationProducts[Product.countProduct] = classificationProduct;
                Product.countProduct++;
                break;

            } else {
                System.out.println("[ERROR] There is no classification product like that. Try again.");
            }

        }

    }

    public static void updateProduct() {
        
        Product.displayProducts();
        
        int idProduct;
        String descriptionProduct = "";
        Product.findProduct = false;
        
        Scanner keyboard = new Scanner(System.in);
       
        while (!Product.findProduct) {
            
            System.out.println();
            System.out.println("Type the ID of the product that would you like to change: ");
            idProduct = keyboard.nextInt();

            if (idProduct < 0 || idProduct > Product.maxProducts) {
                    
                System.out.println();
                System.out.println("[ERROR] There is no negative ID and/or non-existent ID.");
                break;

            } else if (idProduct >= 0 || idProduct > Product.maxProducts) {
                
                if(Product.tableProducts[idProduct] == null || Product.tableProducts[idProduct].trim().isEmpty()) {
                    
                    System.out.println();
                    System.out.println("[ERROR] There is no product registered.");
                    break;
                
                } else {
                    
                    while (descriptionProduct == null || descriptionProduct.trim().isEmpty()) {

                        System.out.println();
                        System.out.println("Type the new description product: ");
                        descriptionProduct = keyboard.next();

                        Product.tableProducts[idProduct] = descriptionProduct;
                        System.out.println();
                        System.out.println("The description product was updated successfully!");
                        Product.findProduct = true;
                        break;                       

                    }
                }                
            } else {
                
                if(Product.findProduct) {
                    break;
                }
            } 
        }        
   
    }
    
    public static void removeProduct() {
        
        Product.displayProducts();
        
        int idProduct;
        Product.findProduct = false;
        
        Scanner keyboard = new Scanner(System.in);
       
        while (!Product.findProduct) {
            
            System.out.println();
            System.out.println("Type the ID of the product that would you like to remove: ");
            idProduct = keyboard.nextInt();

            if (idProduct < 0 || idProduct > Product.maxProducts) {
                    
                System.out.println();
                System.out.println("[ERROR] There is no negative ID and/or non-existent ID.");
                break;

            } else if (idProduct >= 0 || idProduct > Product.maxProducts) {
                
                if(Product.tableProducts[idProduct] == null || Product.tableProducts[idProduct].trim().isEmpty()) {
                    
                    System.out.println();
                    System.out.println("[ERROR] There is no product registered.");
                    break;
                
                } else {
                    
                    Product.tableProducts[idProduct] = null;
                    Product.tableClassificationProducts[idProduct] = null;
                    Product.tableInventoryProducts[idProduct] = 0;
                    System.out.println();
                    System.out.println("The product was removed successfully!");
                    Product.findProduct = true;
                    break;                       

                    
                }   
                
            } else {
                
                if(Product.findProduct) {
                    break;
                }
            } 
        }      
    }

    public static void displayProducts() {

        // Header
        System.out.println(""); 
        System.out.println("| ID | CLASSIFICATION | DESCRIPTION PRODUCT  | INVENTORY |");
        
        for (int i = 0; i < Product.countProduct; i++) {

            if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {

                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
            }

        }

    }
    
    public static void displaySortingProducts() {
        
        int classificationOption = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        while(classificationOption != 3) {
            System.out.println("");
            System.out.println("--------------- CLASSIFICATION PRODUCT ------------------");
            System.out.println("");
            System.out.println("[1] Display sorted in order list of products - ASC       ");
            System.out.println("[2] Display sorted in descending list of products - DESC ");
            System.out.println("[3] Back to the menu                                     ");
            System.out.println("");
            System.out.println("Type an option from classification product: ");
            classificationOption = keyboard.nextInt();
            
            switch(classificationOption) {
                
                case 1: 
                    Product.displayProducts();
                    classificationOption = 3;
                    break;
                case 2:
                    
                    // Header
                    System.out.println("");
                    System.out.println("| ID | CLASSIFICATION | DESCRIPTION PRODUCT  | INVENTORY |");

                    for (int i = Product.countProduct; i >= 0; i--) {

                        if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {

                            System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
                        }

                    }
                    classificationOption = 3;
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Back to the menu...");
                    break;
                default: 
                    System.out.println("");
                    System.out.println("[ERROR] Invalid option. Try again!");
                    
            }
        }
        
        
    }
    
    
    public static void addInventory() {
        
        Product.displayProducts();
        
        int idProduct;
        int quantityItemsProduct = -1;
        Product.findProduct = false;
        
        Scanner keyboard = new Scanner(System.in);
       
        while (!Product.findProduct) {
            
            System.out.println();
            System.out.println("Type the ID of the product that would you like to add items from inventory: ");
            idProduct = keyboard.nextInt();

            if (idProduct < 0 || idProduct > Product.maxProducts) {
                    
                System.out.println();
                System.out.println("[ERROR] There is no negative ID and/or non-existent ID.");
                break;

            } else if (idProduct >= 0 || idProduct > Product.maxProducts) {
                
                if(Product.tableProducts[idProduct] == null || Product.tableProducts[idProduct].trim().isEmpty()) {
                    
                    System.out.println();
                    System.out.println("[ERROR] There is no product registered.");
                    break;
                
                } else {
                    
                    while (quantityItemsProduct < 0 ) {
                        
                        System.out.println();
                        System.out.println("How many items of these product would you like to add: ");
                        quantityItemsProduct = keyboard.nextInt();
                        
                        if(quantityItemsProduct < 0) {
                            
                            System.out.println();
                            System.out.println("The quantity of the items must not be negative. Try again.");
                        
                        } else {
                            
                            Product.tableInventoryProducts[idProduct] = Product.tableInventoryProducts[idProduct] + quantityItemsProduct;
                            System.out.println();
                            System.out.println("The quantity was added to the product successfully!");
                            Product.findProduct = true;
                            break;
                            
                        }

                    }
                }                
            } else {
                
                if(Product.findProduct) {
                    break;
                }
            } 
        }
    }
    
    public static void removeInventory() {
        
        Product.displayProducts();
        
        int idProduct;
        int quantityItemsProduct = 0;
        Product.findProduct = false;
        
        Scanner keyboard = new Scanner(System.in);
       
        while (!Product.findProduct) {
            
            System.out.println();
            System.out.println("Type the ID of the product that would you like to remove items from inventory: ");
            idProduct = keyboard.nextInt();

            if (idProduct < 0 || idProduct > Product.maxProducts) {
                    
                System.out.println();
                System.out.println("[ERROR] There is no negative ID and/or non-existent ID.");
                break;

            } else if (idProduct >= 0 || idProduct > Product.maxProducts) {
                
                if(Product.tableProducts[idProduct] == null || Product.tableProducts[idProduct].trim().isEmpty()) {
                    
                    System.out.println();
                    System.out.println("[ERROR] There is no product registered.");
                    break;
                
                } else if (Product.tableInventoryProducts[idProduct] == 0) {

                    System.out.println();
                    System.out.println("The inventory of this product is already zeroed.");
                    break;
                    
                } else {
                    
                    while (true) {
                        
                        System.out.println();
                        System.out.println("How many items of these product would you like to remove: ");
                        quantityItemsProduct = keyboard.nextInt();
                        
                        if(quantityItemsProduct < 0) {
                            
                            System.out.println();
                            System.out.println("The quantity of the items must not be negative. Try again!");
                        
                        } else if (quantityItemsProduct == 0) {
                            
                            System.out.println();
                            System.out.println("The quantity of the items typed was zeroed. There is no change found."); 
                            Product.findProduct = true;
                            break;
                            
                        } else if (Product.findProduct) {
                            break;
                            
                        } else {
                            
                            Product.tableInventoryProducts[idProduct] = Product.tableInventoryProducts[idProduct] - quantityItemsProduct;
                            
                            if(Product.tableInventoryProducts[idProduct] < 0) {
                                
                                Product.tableInventoryProducts[idProduct] = 0;
                                System.out.println();
                                System.out.println("[ATTENTION] The quantity was typed EXCEEDED the inventory ifo the product for removing!");
                                System.out.println("[ATTENTION] However, the product has its inventory reseted to zero, cause it's impossivel go to negative!");
                                 
                                
                            }

                            System.out.println();
                            System.out.println("The quantity was removed from the product successfully!");
                            Product.findProduct = true;
                            break;
                        }

                    }
                } 
                
            } else {
                
                if(Product.findProduct) {
                    break;
                }
            } 
        }
    }

    public static void main(String[] args) {
        
        Product.login();

    }

}
