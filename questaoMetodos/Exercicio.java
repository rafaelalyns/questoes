package questaoMetodos;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        // classe calculadora capaz de calcular soma, subtra��o,
        // divis�o, multiplica��o e potencia��o

        Scanner scanner = new Scanner(System.in);
        
        Calculadora calc = new Calculadora();

        System.out.println("Informe o primeiro n�mero: ");
        calc.numero1 = scanner.nextDouble();

        System.out.println("Informe a opera��o desejada: ");
        String operador = scanner.next();

        System.out.println("Informe o segundo n�mero: ");
       calc.numero2 = scanner.nextDouble();

        Calculadora.calcular();
        System.out.println("O resultado �: " + Calculadora.resultado);
        scanner.close();
        

    }



}
