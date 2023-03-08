package estruturaDecisao;
import java.io.InputStream;
import java.util.Scanner;

public class outraquestao {

    public static void main(String[] args) {
      try (Scanner operacao = new
        Scanner(System.in)) {
        System.out.println("Escreva o símbolo da operação: ");
                 String operacao1 = operacao.nextLine(); {
                switch (operacao1) {
                case "+":
                System.out.println("A operacao é adicao");
                break;
                case "-":
                    System.out.println("A operacao é subtracao");
                    break;
                case "*":
                    System.out.println("A operacao é multiplicacao");
                    break;
                case "/":
                    System.out.println("A operacao é divisao");
                    break;
                }
                Scanner primeiro = new       
                Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            int primeiroNumero = primeiro.nextInt();
            
            Scanner segundo = new       
                    Scanner(System.in);
                System.out.println("Digite o segundo número: ");
                int segundoNumero = segundo.nextInt();
            
            
                    
        }

}
    }

    private static void Scanner(InputStream in) {
    }
}
