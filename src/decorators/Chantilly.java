package decorators;

import Models.CoupeGlacee;
import Models.IProduit;

public class Chantilly extends ToppingDecorator{

    public Chantilly(IProduit produit) {
        super(produit);
    }

    @Override
    public String description() {
        return "chantilly";
    }

    @Override
    public float cout() {
        return 0.5f;
    }
}
