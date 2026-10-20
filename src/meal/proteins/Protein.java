package meal.proteins;

import meal.Food;
import meal.Macronutrient;

public abstract class Protein extends Food {
    protected Protein(String name) {
        super(name);
    }

    @Override
    public Macronutrient getMacronutrient() {
        return Macronutrient.PROTEIN;
    }
}
