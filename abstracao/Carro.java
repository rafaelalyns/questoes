package abstracao;

public class Carro {
    // caracteristicas
    String marca;
    boolean ligado;
    
    boolean sistemaEletricoPronto;
    boolean sistemaArPronto;
    boolean sistemaFrenagemPronto;
    
    Carro(String marcaDoCarro) { //metodo especial que é acionado quando ocorre uma nova instancia
        this.marca = marcaDoCarro;
    }
    
    //comportamentos
    void ligar() {
       this.ligado = acionarMotorACombustao();
       
       this.sistemaEletricoPronto = this.ligado;
       this.sistemaArPronto = this.ligado;
       this.sistemaFrenagemPronto = this.ligado;
       
    }
    void desligar () {
        this.ligado = false;
        
    }
    boolean acionarMotorACombustao() {
        
        if(this.executarTempo1() == false)
            return false;
        
        if(this.executarTempo2() != true)
            return false;

        if(!this.executarTempo3())
            return false;
        
        if(this.executarTempo4() == false)
            return false;
        
        return true;
    }
    
    boolean executarTempo1() {
        return true;
    }
    boolean executarTempo2() {
        return true;
    }
    boolean executarTempo3() {
        return true;
    }
    boolean executarTempo4() {
        return true;
}
}