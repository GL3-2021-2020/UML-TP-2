package commande;

import glace.CoupeGlacee;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class Commande {

    List<CoupeGlacee> lesCoupes;

    public Commande(List<CoupeGlacee> lesCoupes) {
        this.lesCoupes = lesCoupes;
    }

    public void publieFacture(PrintWriter writer) {
        float total = 0;
        for (Iterator it = this.lesCoupes.iterator(); it.hasNext(); ) {
            CoupeGlacee coupe = (CoupeGlacee) it.next();
            writer.println(coupe.description() + " + " + coupe.cout());
            total = total + coupe.cout();
        }
        writer.println(" TOTAL : " + total);

    }
}