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
                           [4] Display products 
                           [5] Print products 
                           [6] Sort products by ranking 
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
                    break;
                case 4:
                    Product.displayProducts();
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
            System.out.println("Type the ranking product: ");
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
        
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println();
        System.out.println("Type the ID of the product that would you like to change: ");
        idProduct = keyboard.nextInt();

        if (idProduct < 0 || idProduct > Product.maxProducts) {
            
            System.out.println("[ERROR] There is no negative ID and/or non-existent ID.");
            
        } else if (idProduct >= 0 || idProduct > Product.maxProducts && "".equals(Product.tableProducts[idProduct]) || " ".equals(Product.tableProducts[idProduct])) {

            while (true) {

                System.out.println();
                System.out.println("Type the new description product: ");
                descriptionProduct = keyboard.next();

                if ("".equals(Product.tableProducts[idProduct]) || " ".equals(Product.tableProducts[idProduct])) {
                    System.out.println("[ERROR] The product must have a description. Try again!");
                } else {
                    Product.tableProducts[idProduct] = descriptionProduct;
                    System.out.println();
                    System.out.println("The description product was updated successfully!");
                    break;
                }

            }
        } else {
            System.out.println("[ERROR] There is no product registered.");
        }
   
    }

    public static void displayProducts() {

        // Header
        System.out.println(""); 
        System.out.println("| ID | CLASSIFICATION | DESCRIPTION PRODUCT | INVENTORY |");
        
        for (int i = 0; i < Product.countProduct; i++) {

            if (!"".equals(Product.tableProducts[i])) {

                System.out.printf("| %-2d | %-14s | %-20s | %-9d \n", i, Product.tableClassificationProducts[i], Product.tableProducts[i], Product.tableInventoryProducts[i]);
            }

        }

    }

    public static void main(String[] args) {
        
        Product.login();

    }

}
