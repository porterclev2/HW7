package meal.proteins;

public class Chicken extends Protein {
    public Chicken() {
        super("Chicken");
    }

    @Override
    public boolean isMeat() {
        return true;
    }
}
