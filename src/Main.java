import commande.Commande;
import decorators.Chantilly;
import decorators.SauceChocolat;
import decorators.ToppingDecorator;
import glace.CoupeGlacee;
import glace.TripleChocolat;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TripleChocolat glace = TripleChocolat.SINGLETON;
        ToppingDecorator toppingDecoratorChantilly= new Chantilly(glace);
        ToppingDecorator toppingDecoratorSauce= new SauceChocolat(glace);

        List<CoupeGlacee> cg = List.of(glace ,toppingDecoratorSauce, toppingDecoratorChantilly);

        Commande cmd = new Commande(cg);
        cmd.publieFacture();
    }
}
