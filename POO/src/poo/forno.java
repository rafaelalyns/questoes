package poo;

public class forno {
    //caracteristicas
    String tipo = "";
    boolean ligado;
    double temperatura = 0;
    
    //comportamentos
   void ligar(double temperatura) {
       this.temperatura = temperatura; 
       this.ligado = true;
    }
   
   void assar(Biscoito biscoito) {
       biscoito.pronto = true;
   }
}
