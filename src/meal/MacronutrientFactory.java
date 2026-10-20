package meal;

import java.util.Objects;

import meal.proteins.ProteinFactory;
import meal.carbs.CarbsFactory;
import meal.fats.FatsFactory;
import meal.proteins.Protein;
import meal.carbs.Carbs;
import meal.fats.Fats;

public class MacronutrientFactory {
    private static MacronutrientFactory INSTANCE = new MacronutrientFactory();

    private MacronutrientFactory() {
    }

    public static MacronutrientFactory getInstance() {
        return INSTANCE;
    }

    public FoodFactory<? extends Food> getFactory(Macronutrient macronutrient) {
        Objects.requireNonNull(macronutrient, "Macronutrient must be set to choose a factory");
        return switch (macronutrient) {
            case CARBS -> getCarbsFactory();
            case PROTEIN -> getProteinFactory();
            case FATS -> getFatsFactory();
        };
    }

    public FoodFactory<Carbs> getCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    public FoodFactory<Protein> getProteinFactory() {
        return ProteinFactory.getInstance();
    }

    public FoodFactory<Fats> getFatsFactory() {
        return FatsFactory.getInstance();
    }

    public Meal createMeal(Customer customer) {
        Objects.requireNonNull(customer, "Customer must be set to create a meal");

        DietPlan dietPlan = customer.getDietPlan();
        
        Carbs carbs = getCarbsFactory().createRandomFood(dietPlan);
        Protein protein = getProteinFactory().createRandomFood(dietPlan);
        Fats fats = getFatsFactory().createRandomFood(dietPlan);

        return new Meal(customer, carbs, protein, fats);
    }
}
