package numerosAleatorios;

import java.util.Random;

public class Exemplos {

    public static void main(String[] args) {
        double aleatorio1 = Math.random();
                System.out.println(Math.round(aleatorio1* 20));
    
    Random sort = new Random();
    int aleatorio2 = sort.nextInt(1000);
    System.out.println(aleatorio2);
    
    
    }

}
