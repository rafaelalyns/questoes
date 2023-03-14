package questaoMetodos;

public class Calculadora {

    static double numero1;
    static double numero2;
    
    static double resultado;
    
    static void calcular() {
        switch (operador) {
        case "+":
            Calculadora.somar(numero1, numero2);
            break;

        case "-":
            Calculadora.subtrair(numero1, numero2);
            break;

        case "*":
            Calculadora.multiplicar(numero1, numero2);
            break;

        case "/":
            Calculadora.dividir(numero1, numero2);
            break;

        case "^":
            Calculadora.potencializar(numero1, numero2);
            break;

        default:
            System.out.println("A operação é inválida.");
            break;
        }
    }

    static void somar(double numero1,double numero2) {
        resultado = numero1 + numero2;
        System.out.println(resultado);
    }

    static void subtrair(double numero1, double numero2) {
        resultado = numero1 - numero2;
    }

    static void multiplicar(double numero1, double numero2) {
        resultado = numero1 * numero2;
    }

    static void dividir(double numero1, double numero2) {
        resultado = numero1 / numero2;
    }

    static void potencializar(double numero1, double numero2) {
        resultado = numero1 ^ numero2;
}
}

