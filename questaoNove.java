package estruturaDecisao;
import java.util.Scanner;
public class questaoNove {

    public static void main(String[] args) {
// criar um contador fibonacci que responda ate dado numero
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um n�mero desejado: ");
        int objetivo = scan.nextInt();
        
        int num1 = 0; // exce��o
        int num2 = 1; //exce��o
        System.out.print(num1 + " " + num2 + " ");
        
        while (true) {
            //proximo = atual + anterior
            int num3 = num2 + num1;
              
            num1 = num2;
            num2 = num3;
            
            if (num3 > objetivo)
                return;
            
            System.out.print(num3 + " ");
        }
             
        
        
        
        
    }

}
