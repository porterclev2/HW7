package meal.fats;

public class SourCream extends Fats {
    public SourCream() {
        super("Sour cream");
    }

    @Override
    public boolean isDairy() {
        return true;
    }
}
