package meal;

import java.util.Objects;

public class Customer {
    private DietPlan dietPlan;
    private String name;

    public Customer(String name, DietPlan dietPlan) {
        Objects.requireNonNull(name, "Customer name must be set");
        if (name.isBlank()) {
            throw new IllegalArgumentException("Customer can't be blank");
        }
        this.name = name;
        this.dietPlan = Objects.requireNonNull(dietPlan, "Diet plan needs to be set for customer " + name);
    }

    public String getName() {
        return name;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }
}
