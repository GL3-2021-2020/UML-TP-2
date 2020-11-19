import Models.Café;
import Models.IProduit;
import commande.Commande;
import decorators.Chantilly;
import decorators.SauceChocolat;
import decorators.ToppingDecorator;
import Models.CoupeGlacee;
import Models.TripleChocolat;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TripleChocolat glace = TripleChocolat.SINGLETON;
        ToppingDecorator toppingDecoratorChantillyGlace = new Chantilly(glace);
        ToppingDecorator toppingDecoratorSauce = new SauceChocolat(glace);

        Café café = Café.SINGLETON;
        café.setVarieté("Arabica");
        ToppingDecorator toppingDecoratorChantillyCafé = new Chantilly(café);

        List<IProduit> cg = List.of(glace, toppingDecoratorSauce, toppingDecoratorChantillyGlace
                , café , toppingDecoratorChantillyCafé);

        Commande cmd = new Commande(cg);
        cmd.publieFacture();
    }
}
