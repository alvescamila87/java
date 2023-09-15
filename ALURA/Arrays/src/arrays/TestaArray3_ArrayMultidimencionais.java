package arrays;

/**
 *
 * @author Camila
 */
public class TestaArray3_ArrayMultidimencionais {
    
    public static void main(String[] args) {
        
        // array multidimensionais - declarações:
        int[][] tabela;
        tabela = new int[10][5]; // 10 x 5
              
        int[][] cubo[];
        cubo = new int[10][][];
        
        int[][] hipercubo[][];
        hipercubo = new int[5][][][];
        
        int[][] teste = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}; // 3 x 2
        
        // acessando a posição (0,1)
        System.out.println(tabela[0][1]);
        
        // array dentro de array
        int[][] desordenado = new int[2][];
        desordenado[0] = new int[20];
        desordenado[1] = new int[10];
        
        // acesso ao array:
        for(int i = 0; i < desordenado.length; i++) {
            System.out.println(desordenado[i].length);
        }
       
        
    }
    
}

class A {
    public static void main(String[] args) {
        int zyx[][]=new int[3][];
        int[]x=new int[20];
        int[]y=new int[10];
        int[]z=new int[30];
        zyx[0]=x;
        zyx[1]=y;
        zyx[2]=z;
        System.out.println(zyx[2].length);
    }
}