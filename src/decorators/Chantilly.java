package decorators;

import glace.CoupeGlacee;

public class Chantilly extends ToppingDecorator{

    public Chantilly(CoupeGlacee coupeGlacee) {
        super(coupeGlacee);
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
