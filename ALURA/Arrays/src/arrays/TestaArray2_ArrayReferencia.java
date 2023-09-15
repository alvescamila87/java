
package arrays;

/**
 *
 * @author Camila
 */
public class TestaArray2_ArrayReferencia {
    public static void main(String[] args) {
        
        // Array cliente
        Cliente[] clientes = new Cliente[10];
        
        for(int i = 0; i < clientes.length; i++) {
           clientes[i] = new Cliente();
           clientes[i].nome = "Paulo";   
        }
        
        System.out.println(clientes[0].nome);
        
        for(Cliente c : clientes) {
            System.out.println(c.nome);
        }
        
        
         // Array cliente com herança
         Cliente clientes2[] = new Cliente[5];
         clientes2[0] = new Cliente();
         clientes2[1] = new ClienteEspecial();
         
         // Modificação de conteúdo
         
         Cliente guilherme = new Cliente();
         guilherme.nome = "Guilherme";
         
         clientes2[0] = guilherme;
         
         System.out.println(guilherme.nome);
         System.out.println(clientes2[0].nome);
         
         guilherme.nome = "Mario";
         
         System.out.println(guilherme.nome);
         System.out.println(clientes2[0].nome);
         
    }
       
}

class Cliente {
    String nome;
}

class ClienteEspecial extends Cliente{
    
}

class A {
    public static void main(String[] args) {
        String[] valores = new String[2];
        valores[0] = "Certificação";
        valores[1] = "Java";
        Object[] vals = (Object[]) valores;
        vals[1] = "Daniela";
        System.out.println(vals[1].equals(valores[1]));
    }
}
