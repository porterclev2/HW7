package meal.carbs;

import java.util.List;
import meal.FoodFactory;

public class CarbsFactory extends FoodFactory<Carbs> {
    private static CarbsFactory INSTANCE = new CarbsFactory();

    private CarbsFactory() {}

    public static CarbsFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> getMenu() {
        return List.of("Cheese", "Bread", "Lentils", "Pistachio");
    }

    @Override
    public Carbs createFood(String name) {
        return switch (name) {
            case "Cheese" -> new Cheese();
            case "Bread" -> new Bread();
            case "Lentils" -> new Lentils();
            case "Pistachio" -> new Pistachio();
            default -> throw new IllegalArgumentException("Unknown Carbs: " + name);
        };
    }
}
