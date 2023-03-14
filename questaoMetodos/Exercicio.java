package questaoMetodos;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        // classe calculadora capaz de calcular soma, subtração,
        // divisão, multiplicação e potenciação

        Scanner scanner = new Scanner(System.in);
        
        Calculadora calc = new Calculadora();

        System.out.println("Informe o primeiro número: ");
        calc.numero1 = scanner.nextDouble();

        System.out.println("Informe a operação desejada: ");
        String operador = scanner.next();

        System.out.println("Informe o segundo número: ");
       calc.numero2 = scanner.nextDouble();

        Calculadora.calcular();
        System.out.println("O resultado é: " + Calculadora.resultado);
        scanner.close();
        

    }



}
