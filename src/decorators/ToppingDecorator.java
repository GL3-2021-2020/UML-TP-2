package decorators;

import Models.CoupeGlacee;
import Models.IProduit;

public class ToppingDecorator implements IProduit {
    IProduit produit;

    public ToppingDecorator(IProduit produit) {
        this.produit = produit;
    }

    @Override
    public String description() {
        return produit.description();
    }

    @Override
    public float cout() {
        return produit.cout();
    }
}
