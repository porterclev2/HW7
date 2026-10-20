package meal.carbs;

public class Cheese extends Carbs {
    public Cheese() {
        super("Cheese");
    }

    @Override
    public boolean isDairy() {
        return true;
    }
}
