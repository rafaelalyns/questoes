package arrays;

import java.util.Iterator;

public class Exemplo {

    public static void main(String[] args) {
         /*int[] vetor = { 14, 17, 26 };
        //System.out.println(vetor[0]);
        for (int i = 0; i < vetor.length; i++)
            System.out.println(vetor[i]);*/
    }
        // Array de duas dimensões (matriz)
         //           00  01  02      10   11   12   20  21 22
    int[][] matriz = {{67, 60, 79}, {78, 801, 45}, {3, 6, 78}}; {
      
    System.out.println(matriz[1][2]);
    System.out.println(matriz.length);
     
      for (int indiceM = 0; indiceM < matriz.length; indiceM++) {
          //estou iterando sobre as linhas
          System.out.println(indiceM + " -------------- ");
        for (int COLUNA = 0; COLUNA < matriz[indiceM].length; COLUNA++) {
            //estou iterando sobre as colunas da linha
            System.out.println(matriz[indiceM][COLUNA]+ " ");
        }
      System.out.println();
      } 
      
    /* //Array 3d
                                     //000  001   010  011     100  101   110   111      200   201   210   211          
                int [][][] array = { { { 10, 68} , {67, 78} }, { {57, 67}, {78, 99} }, { {55, 89} , {07, 03} }};
               // System.out.println(array[1][0][1]);
               for (int indiceA = 0; indiceA < array.length; indiceA++) {
                   for(int indiceA2 = 0;indiceA2 < array[indiceA].length; indiceA2++) {
                       for(int indiceA3 = 0; indiceA3 < array[indiceA][indiceA2].length; indiceA3++) {
                           System.out.println(array[indiceA][indiceA2][indiceA3]); */
                           
                       }
                       
               }


