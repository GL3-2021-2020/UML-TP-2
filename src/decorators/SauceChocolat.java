package decorators;

import Models.CoupeGlacee;
import Models.IProduit;

public class SauceChocolat extends ToppingDecorator{
    public SauceChocolat(IProduit produit) {
        super(produit);
    }
    @Override
    public String description() {
        return  "et sa délicieuse sauce chocolat";
    }
    @Override
    public float cout() {
        return 0.7f;
    }
}
