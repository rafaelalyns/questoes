package abstracao;

public class Exemplo {

    public static void main(String[] args) {
        //problema: ligar um carro e saber se está ligado ou não
        
        // ter um carro instanciado
        Carro meuCarro = new Carro("Ford");
        
        
        // ligar o carro
        meuCarro.ligar();
        
        //verificar se esta ligado
        
        if (meuCarro.ligado)
            System.out.println("Carro está ligado.");
        else 
            System.out.println("Carro não está ligado.");
    }

}
