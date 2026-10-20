package meal.proteins;

import java.util.List;
import meal.FoodFactory;

public class ProteinFactory extends FoodFactory<Protein> {
    private static ProteinFactory INSTANCE = new ProteinFactory();

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> getMenu() {
        return List.of("Fish", "Chicken", "Beef", "Tofu");
    }

    @Override
    public Protein createFood(String name) {
        return switch (name) {
            case "Fish" -> new Fish();
            case "Chicken" -> new Chicken();
            case "Beef" -> new Beef();
            case "Tofu" -> new Tofu();
            default -> throw new IllegalArgumentException("Unknown Protein: " + name);
        };
    }
}
