
package aula09_metodos;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Metodo_Login {

    public static void login() {
        
        Scanner keyboard = new Scanner (System.in);
        
        String usernameDataBase = "admin";
        String passwordDataBase = "123456";
        
        String username;
        String password;
        
        int option = 1;       
        
        
        do {
            
            System.out.print("Type your username: ");
            username = keyboard.nextLine();
            
            System.out.print("Type your password ");
            password = keyboard.nextLine();
            keyboard.nextLine(); // Clean buffer of the keyboard
            
            
            if(username.equals(usernameDataBase) && password.equals(passwordDataBase)) {
                
                System.out.println("You're logged!");
                option = 1;
                
            } else {
                
                System.out.println("[ERROR] Invalid username or password!");
                System.out.println(" Would you like to try again? ");
                System.out.println("[1] Exit ");
                System.out.println("[2] Try again");
                option = keyboard.nextInt();
                keyboard.nextLine(); // Clean buffer of the keyboard
            }
            
        } while(option == 2);
            
        
        
    }
              
    


    public static void main(String[] args) {
        
       login();   
             
        
        
    }
    
}
