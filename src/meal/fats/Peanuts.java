package meal.fats;

public class Peanuts extends Fats {
    public Peanuts() {
        super("Peanuts");
    }

    @Override
    public boolean isNut() {
        return true;
    }
}
