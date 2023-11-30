package aula09_metodos.sa;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Product {

    private static int maxProduct = 50;
    private int countProduct = 0;
    private String[] tableProducts = new String[maxProduct];
    private String[] tableRankingProducts = new String[maxProduct];
    

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
                    products.insertProduct();
                    break;
                case 2:
                    products.updateProduct();
                    break;
                case 3:
                    break;
                case 4:
                    products.displayProducts();
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

        Product products = new Product();

        String descriptionProduct = "";
        String rankingProduct = "";

        Scanner keyboard = new Scanner(System.in);

        while ("".equals(descriptionProduct)) {

            System.out.println("Type the product description: ");
            descriptionProduct = keyboard.next();

            if (!"".equals(descriptionProduct)) {

                products.tableProducts[products.countProduct] = descriptionProduct;
                break;

            } else {
                System.out.println("[ERROR] There is no description product. Try again.");
            }

        }

        while ("".equals(rankingProduct)) {

            System.out.println("[A] Gold product");
            System.out.println("[B] Premium product");
            System.out.println("[C] Regular product");
            System.out.println("");
            System.out.println("Type the ranking product: ");
            rankingProduct = keyboard.next();

            if (!"".equals(rankingProduct)) {

                products.tableRankingProducts[products.countProduct] = rankingProduct;
                products.countProduct++;
                break;

            } else {
                System.out.println("[ERROR] There is no ranking product. Try again.");
            }

        }

    }

    public static void updateProduct() {

        Product products = new Product();

    }

    public static void displayProducts() {

        Product products = new Product();

        for (int i = 0; i < products.countProduct; i++) {

            if (!"".equals(products.tableProducts[i])) {

                System.out.println(products.tableProducts[i]);

            }

        }

    }

    public static void main(String[] args) {

        login();

    }

}
