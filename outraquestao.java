package estruturaDecisao;
import java.io.InputStream;
import java.util.Scanner;

public class outraquestao {

    public static void main(String[] args) {
      try (Scanner operacao = new
        Scanner(System.in)) {
        System.out.println("Escreva o s�mbolo da opera��o: ");
                 String operacao1 = operacao.nextLine(); {
                switch (operacao1) {
                case "+":
                System.out.println("A operacao � adicao");
                break;
                case "-":
                    System.out.println("A operacao � subtracao");
                    break;
                case "*":
                    System.out.println("A operacao � multiplicacao");
                    break;
                case "/":
                    System.out.println("A operacao � divisao");
                    break;
                }
                Scanner primeiro = new       
                Scanner(System.in);
            System.out.println("Digite o primeiro n�mero: ");
            int primeiroNumero = primeiro.nextInt();
            
            Scanner segundo = new       
                    Scanner(System.in);
                System.out.println("Digite o segundo n�mero: ");
                int segundoNumero = segundo.nextInt();
            
            
                    
        }

}
    }

    private static void Scanner(InputStream in) {
    }
}
