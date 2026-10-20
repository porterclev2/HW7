package meal;

public abstract class Carbs extends Food {
    protected Carbs(String name) {
        super(name);
    }

    @Override
    public Macronutrient getMacronutrient() {
        return Macronutrient.CARBS;
    }
}
