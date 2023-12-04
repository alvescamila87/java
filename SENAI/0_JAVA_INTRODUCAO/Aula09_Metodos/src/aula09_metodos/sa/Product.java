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
                    Product.displayClassificationProducts();                    
                    break;
                case 7:
                    Product.addInventory();
                    break;
                case 8:
                    Product.removeInventory();
                    break;
                case 9:
                    System.out.println("");
                    System.out.println("The program is finishing.");
                    break;
                default:
                    System.out.println("[ERROR] Invalid option. Try again!");

            }

        } while (optionMenu != 9);
    }

    public static void insertProduct() {
        
        Product.displayProducts();

        String descriptionProduct = "";
        char classificationProduct = 0;
        

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

        while (classificationProduct == '\0') {

            System.out.println();
            System.out.println("[A] Gold line");
            System.out.println("[B] Premium line");
            System.out.println("[C] Regular line");
            System.out.println("");
            System.out.println("Type the classification of the product: ");
            classificationProduct = keyboard.next().charAt(0);
            
            char classificationProductUpperCase = Character.toUpperCase(classificationProduct);

//            if (!''.equals(classificationProduct)) {
//
//                Product.tableClassificationProducts[Product.countProduct] = classificationProduct;
//                Product.countProduct++;
//                break;
//
//            } else {
//                System.out.println("[ERROR] There is no classification product like that. Try again.");
//            }
            
            switch(classificationProductUpperCase) {
                case 'A': 
                    Product.tableClassificationProducts[Product.countProduct] = "Gold line";
                    Product.countProduct++;
                    break;
                case 'B': 
                    Product.tableClassificationProducts[Product.countProduct] = "Premium line";
                    Product.countProduct++;
                    break;
                case 'C': 
                    Product.tableClassificationProducts[Product.countProduct] = "Regular line";
                    Product.countProduct++;
                    break;
                default: 
                    System.out.println("");
                    System.out.println("[ERROR] There is no classification product like that. Try again.");
                    classificationProduct = '\0';
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
            System.out.println("-------------------- LIST OF PRODUCTS -------------------");
            System.out.println("");
            System.out.println("[1] Display sorted in order list of products - ASC       ");
            System.out.println("[2] Display sorted in descending list of products - DESC ");
            System.out.println("[3] Back to the menu                                     ");
            System.out.println("");
            System.out.println("---------------------------------------------------------");
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
    
    public static void displayClassificationProducts() {
        
        int classificationOption = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        while(classificationOption != 5) {
            System.out.println("");
            System.out.println("----------- FILTER BY CLASSIFICATION PRODUCT ------------");
            System.out.println("");
            System.out.println("[1] Gold line");
            System.out.println("[2] Premium line");
            System.out.println("[3] Regular line");
            System.out.println("[4] Order classication products");
            System.out.println("[5] Back to the menu                                     ");
            System.out.println("");
            System.out.println("---------------------------------------------------------");
            System.out.println("");
            System.out.println("Type an option to filter classification products: ");
            classificationOption = keyboard.nextInt();
            
            switch(classificationOption) {
                case 1: 
                    // Header
                    System.out.println("");
                    System.out.println("| ID | CLASSIFICATION | DESCRIPTION PRODUCT  | INVENTORY |");

                    for (int i = 0; i < Product.countProduct; i++) {

                        if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {
                            
                            if("Gold line".equals(Product.tableClassificationProducts[i])) {
                                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
                            }
                            
                        }

                    }
                    classificationOption = 5;
                    break;
                case 2:                   
                    // Header
                    System.out.println("");
                    System.out.println("| ID | CLASSIFICATION | DESCRIPTION PRODUCT  | INVENTORY |");

                    for (int i = 0; i < Product.countProduct; i++) {

                        if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {
                            
                            if("Premium line".equals(Product.tableClassificationProducts[i])) {
                                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
                            }
                            
                        }

                    }
                    classificationOption = 5;
                    break;
                case 3:                    
                    // Header
                    System.out.println("");
                    System.out.println("| ID | CLASSIFICATION | DESCRIPTION PRODUCT  | INVENTORY |");

                    for (int i = 0; i < Product.countProduct; i++) {

                        if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {
                            
                            if("Regular line".equals(Product.tableClassificationProducts[i])) {
                                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
                            }
                            
                        }

                    }
                    classificationOption = 5;
                    break;
                case 4:
                    // Header
                    System.out.println("");
                    System.out.println("| ID | CLASSIFICATION | DESCRIPTION PRODUCT  | INVENTORY |");

                    for (int i = 0; i < Product.countProduct; i++) {

                        if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {
                            
                            if("Gold line".equals(Product.tableClassificationProducts[i])) {
                                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
                            }
                            
                        }

                    }
                    
                    for (int i = 0; i < Product.countProduct; i++) {

                        if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {
                            
                            if("Premium line".equals(Product.tableClassificationProducts[i])) {
                                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
                            }
                            
                        }

                    }
                    
                    for (int i = 0; i < Product.countProduct; i++) {

                        if (!"".equals(Product.tableProducts[i]) && Product.tableProducts[i] != null) {
                            
                            if("Regular line".equals(Product.tableClassificationProducts[i])) {
                                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
                            }
                            
                        }

                    }
                    classificationOption = 5;
                    break;               
                case 5:
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
