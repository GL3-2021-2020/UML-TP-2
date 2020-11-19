package Models;

public class Café extends Boisson {

    public static final Café SINGLETON = new Café();
    private String varieté;


    Café(String varieté) {
        this.varieté = varieté;
    }
    Café() {}

    public void setVarieté(String varieté) {
        this.varieté = varieté;
    }

    @Override
    public float cout() {
        return 1.5f;
    }

    @Override
    public String description() {
        return "café "+ varieté;
    }
}
