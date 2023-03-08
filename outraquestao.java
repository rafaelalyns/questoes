package estruturaDecisao;
import java.io.InputStream;
import java.util.Scanner;

public class outraquestao {

    public static void main(String[] args) {
      try (Scanner operacao = new
        Scanner(System.in)) {
          Scanner primeiro = new       
                  Scanner(System.in);
              System.out.println("Digite o primeiro número: ");
              int primeiroNumero = primeiro.nextInt();
              
              Scanner segundo = new       
                      Scanner(System.in);
                  System.out.println("Digite o segundo número: ");
                  int segundoNumero = segundo.nextInt();
              
        System.out.println("Escreva o símbolo da operação: ");
        
                 String operacao1 = operacao.nextLine(); {
                switch (operacao1) {
                case "+":
                System.out.println(primeiroNumero + segundoNumero);
                break;
                case "-":
                    System.out.println(primeiroNumero - segundoNumero);
                    break;
                case "*":
                    System.out.println(primeiroNumero * segundoNumero);
                    break;
                case "/":
                    System.out.println(primeiroNumero / segundoNumero);
                    break;
                }
                
                    
        }

}
    }

    private static void Scanner(InputStream in) {
    }
}
