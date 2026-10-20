package meal;

import java.util.List;

import meal.proteins.ProteinFactory;
import meal.carbs.CarbsFactory;
import meal.fats.FatsFactory;

public class MealDriver {
    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new Customer("Jade", DietPlan.PALEO),
                new Customer("Jordan", DietPlan.PALEO),
                new Customer("Joss", DietPlan.VEGAN),
                new Customer("Ryan", DietPlan.NUT_ALLERGY),
                new Customer("John", DietPlan.NO_RESTRICTION),
                new Customer("David", DietPlan.VEGAN));

        MacronutrientFactory mealFactory = MacronutrientFactory.getInstance();

        System.out.println("Macronutrient Meals");
        for (Customer customer : customers) {
            System.out.println(mealFactory.createMeal(customer));
        }

        System.out.println();
        System.out.println("Singleton check");
        System.out.println("One MacronutrientFactory: " + (mealFactory == MacronutrientFactory.getInstance()));
        System.out.println("One CarbsFactory: " + (mealFactory.getCarbsFactory() == CarbsFactory.getInstance()));
        System.out.println("One ProteinFactory: " + (mealFactory.getProteinFactory() == ProteinFactory.getInstance()));
        System.out.println("One FatsFactory: " + (mealFactory.getFatsFactory() == FatsFactory.getInstance()));
    }
}
