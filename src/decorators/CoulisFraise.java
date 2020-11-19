package decorators;

import Models.CoupeGlacee;
import Models.IProduit;

public class CoulisFraise extends ToppingDecorator{
    public CoulisFraise(IProduit produit) {
        super(produit);
    }

    @Override
    public String description() {
        return "au colis de fraises fraiches";
    }

    @Override
    public float cout() {
        return 1;
    }
}
