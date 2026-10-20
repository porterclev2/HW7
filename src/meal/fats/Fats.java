package meal.fats;

import meal.Food;
import meal.Macronutrient;

public abstract class Fats extends Food {
    protected Fats(String name) {
        super(name);
    }

    @Override
    public Macronutrient getMacronutrient() {
        return Macronutrient.FATS;
    }
}
