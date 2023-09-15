package arrays;

/**
 *
 * @author Camila
 */
public class TestaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // tipos de declaração de array
        int[] idades = new int[10];
        System.out.println(idades[0]);
           
        double[] peso = new double[5];
        System.out.println(peso[0]);
        
       
        //declaração com valores existentes
        int[] numeros = new int[]{0,2,4,6,8};
//        int[] numeros = {0,2,4,6,8,10};
        System.out.println(numeros[2]);
        
        int[] idades2;
        idades2 = new int[]{6,8,10};
        
        // declaração que não compila
        
//        int[] numeros = {1, 2, 5, 7, 5}; // Compila
//        
//        int[] numeros2;
//        numeros2 = {1, 2, 5, 7, 5} // Não compila

//        int[] numeros2;
//        numeros2 = new int[]{1, 2, 5, 7,5}; // Compila
        
        // array de referência
//        Cliente[] clientes = new Cliente[]
//            {new Cliente(), null, new Cliente()};

//        Carro[] carros = new Carro[]
//             {new Carro(), null, new Carro()};


        // tipos de acesso - indice
        System.out.println(idades[0]);
        
        // incluir valor pelo indice
        int[] numeros2 = {13,26,52};
        numeros2[2] = 104;
        System.out.println(numeros2[2]);
        
         // tamanho do array
         System.out.println(numeros2.length);
         
         // percorrer array
         for (int i = 0; i < numeros2.length; i++) {
             System.out.println("Array numeros2 = " + numeros2[i]);            
        }
         
         // percorrer array com forEach
         
         for(int numero : numeros2){
             System.out.println("Array com forEach: " + numero);
         }
         
    }
    
}
