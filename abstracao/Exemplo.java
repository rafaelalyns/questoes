package abstracao;

public class Exemplo {

    public static void main(String[] args) {
        //problema: ligar um carro e saber se est� ligado ou n�o
        
        // ter um carro instanciado
        Carro meuCarro = new Carro("Ford");
        
        
        // ligar o carro
        meuCarro.ligar();
        
        //verificar se esta ligado
        
        if (meuCarro.ligado)
            System.out.println("Carro est� ligado.");
        else 
            System.out.println("Carro n�o est� ligado.");
    }

}
