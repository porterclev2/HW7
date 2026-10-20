package meal.proteins;

public class Fish extends Protein {
    public Fish() {
        super("Fish");
    }

    @Override
    public boolean isMeat() {
        return true;
    }
}
