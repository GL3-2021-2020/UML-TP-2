package glace;

import java.util.ArrayList;
import java.util.List;

public class TripleChocolat extends CoupeGlacee {
    public static final glace.TripleChocolat SINGLETON = new glace.TripleChocolat();
    public List<Parfum> parfums = new ArrayList<>();
    private TripleChocolat() {
        this.parfums.add(Parfum.CHOCOLAIT);
        this.parfums.add(Parfum.CHOCONOIR);
        this.parfums.add(Parfum.CHOCOBLANC);
    }

    @Override
    public String description() {
        return "Coupe chocolat blanc chocolat au lait chocolat noir";
    }

    public float cout() {
        return 6;
    }
}
