package meal.fats;

import java.util.List;
import meal.FoodFactory;

public class FatsFactory extends FoodFactory<Fats> {
    private static FatsFactory INSTANCE = new FatsFactory();

    private FatsFactory() {}

    public static FatsFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> getMenu() {
        return List.of("Avocado", "Sour cream", "Tuna", "Peanuts");
    }

    @Override
    public Fats createFood(String name) {
        return switch (name) {
            case "Avocado" -> new Avocado();
            case "Sour cream" -> new SourCream();
            case "Tuna" -> new Tuna();
            case "Peanuts" -> new Peanuts();
            default -> throw new IllegalArgumentException("Unknown Fats: " + name);
        };
    }
}
