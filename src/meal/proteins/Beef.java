package meal.proteins;

public class Beef extends Protein {
    public Beef() {
        super("Beef");
    }

    @Override
    public boolean isMeat() {
        return true;
    }
}
