package decorators;

import glace.CoupeGlacee;

public class ToppingDecorator extends CoupeGlacee {
    CoupeGlacee coupeGlacee;

    public ToppingDecorator(CoupeGlacee coupeGlacee) {
        this.coupeGlacee = coupeGlacee;
    }

    @Override
    public String description() {
        return coupeGlacee.description();
    }

    @Override
    public float cout() {
        return coupeGlacee.cout();
    }
}
