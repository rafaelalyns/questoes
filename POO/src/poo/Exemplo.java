package poo;

public class Exemplo {

    public static void main(String[] args) {
        forno fornoCasa = new forno();
        fornoCasa.tipo = "metal";
        System.out.println(fornoCasa.ligado + " em " + fornoCasa.temperatura + " graus");
        fornoCasa.ligar(150);
        System.out.println(fornoCasa.ligado + " em " + fornoCasa.temperatura + " graus");
        
        // criar diferentes biscoitos a partir de sua forma
        Biscoito biscoitoDeNatal = new Biscoito(); // instancia um novo objeto
        biscoitoDeNatal.forma = "redondo";
                biscoitoDeNatal.ingredientes[0] = "Farinha de trigo";
                biscoitoDeNatal.ingredientes[1] = "Leite";
                biscoitoDeNatal.ingredientes[2] = "Açúcar";
                biscoitoDeNatal.ingredientes[3] = "Granulado";
                System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);
                fornoCasa.assar(biscoitoDeNatal);
                System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);

                
                Biscoito amanteigado = new Biscoito(); // instancia novo objeto
                amanteigado.forma = "quadrado";
                amanteigado.ingredientes[0] = "Farinha de trigo";
                amanteigado.ingredientes[1] = "Leite";
                amanteigado.ingredientes[2] = "Açúcar";
                amanteigado.ingredientes[3] = "Manteiga";
                System.out.println("Biscoito amanteigado pronto? " + amanteigado.pronto);
                fornoCasa.assar(amanteigado);
                System.out.println("Biscoito amanteigado pronto? " + amanteigado.pronto);
    }

}
