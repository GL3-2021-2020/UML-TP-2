package decorators;

import glace.CoupeGlacee;

public class Chantilly extends ToppingDecorator{

    public Chantilly(CoupeGlacee coupeGlacee) {
        super(coupeGlacee);
    }

    @Override
    public String description() {
        return coupeGlacee.description() + "chantilly";
    }

    @Override
    public float cout() {
        return coupeGlacee.cout() + 0.5f;
    }
}
