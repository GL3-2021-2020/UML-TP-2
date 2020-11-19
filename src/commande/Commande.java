package commande;

import Models.CoupeGlacee;
import Models.IProduit;

import java.util.Iterator;
import java.util.List;

public class Commande {

    List<IProduit> lesProduits;

    public Commande(List<IProduit> lesProduits) {
        this.lesProduits = lesProduits;
    }

    public void publieFacture() {
        float total = 0;
        for (Iterator it = this.lesProduits.iterator(); it.hasNext(); ) {
            IProduit produit = (IProduit) it.next();
            System.out.println(produit.description() + " + " + produit.cout());
            total = total + produit.cout();
        }
        System.out.println(" TOTAL : " + total);

    }
}