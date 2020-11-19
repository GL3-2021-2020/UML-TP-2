package decorators;

import glace.CoupeGlacee;

public class CoulisFraise extends ToppingDecorator{
    public CoulisFraise(CoupeGlacee coupeGlacee) {
        super(coupeGlacee);
    }

    @Override
    public String description() {
        return coupeGlacee.description() + "au colis de fraises fraiches";
    }

    @Override
    public float cout() {
        return coupeGlacee.cout() + 1;
    }
}
