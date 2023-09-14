package aula06_09;

/**
 *
 * @author camila_alves3
 */
public class For_Exe10 {
    public static void main(String[] args) {
        
        int termo1 = 0;
        int termo2 = 1;
        
        System.out.print(termo1 + " " + termo2 + " ");
        
        for (int i = 2; i < 20; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
    
}
