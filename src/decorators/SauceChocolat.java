package decorators;

import glace.CoupeGlacee;

public class SauceChocolat extends ToppingDecorator{
    public SauceChocolat(CoupeGlacee coupeGlacee) {
        super(coupeGlacee);
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
