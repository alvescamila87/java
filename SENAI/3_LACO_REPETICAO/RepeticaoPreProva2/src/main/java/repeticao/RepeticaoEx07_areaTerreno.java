package repeticao;

import java.util.Scanner;

public class RepeticaoEx07_areaTerreno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float area = 101;
        int contador = 1;

        while (area > 100)  {
            System.out.printf("Informe a medida em metros da FRENTE do %sº terreno: ", contador);
            float frente = entrada.nextFloat();

            System.out.printf("Informe a medida em metros da FUNDOS do %sº terreno: ", contador);
            float fundos = entrada.nextFloat();

            area = frente * fundos;

            //if (area > 100) {
            //    System.out.printf("FIM PROGRAMA! \nÁrea: %.2f m². \nÁrea de %sº terreno SUPERIOR a 100m². \n", area, contador);
            //    break;
            //}

            System.out.printf("Área do %sº terreno: %.2f m². \n", contador, area);

            contador ++;
        }

        entrada.close();

    }
}
