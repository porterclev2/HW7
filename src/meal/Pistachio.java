package meal;

public class Pistachio extends Carbs {
    public Pistachio() {
        super("Pistachio");
    }

    @Override
    public boolean isNut() {
        return true;
    }
}
