package meal;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Objects;

public abstract class FoodFactory<T extends Food> {
    private static Random RANDOM = new Random();

    public abstract List<String> getMenu();

    public abstract T createFood(String name);

    public T createRandomFood(DietPlan dietPlan) {
        Objects.requireNonNull(dietPlan, "Diet plan needs to pick a food from " + getClass().getSimpleName());
        List<T> allowed = new ArrayList<>();
        for (String name : getMenu()) {
            T food = createFood(name);
            if (dietPlan.allows(food)) {
                allowed.add(food);
            }
        }
        if (allowed.isEmpty()) {
            throw new IllegalStateException("No food in " + getClass().getSimpleName()
                    + " fits the " + dietPlan + " diet plan");
        }
        return allowed.get(RANDOM.nextInt(allowed.size()));
    }
}
