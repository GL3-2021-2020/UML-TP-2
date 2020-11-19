package Models;

public class ChocolatChaud extends Boisson {
    public static final ChocolatChaud SINGLETON = new ChocolatChaud();
    @Override
    public float cout() {
        return 2;
    }

    @Override
    public String description() {
        return "chocolat chaud";
    }
}
