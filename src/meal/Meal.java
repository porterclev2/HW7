package meal;

import meal.proteins.Protein;
import meal.carbs.Carbs;
import meal.fats.Fats;

public class Meal {
    private Customer customer;
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Customer customer, Carbs carbs, Protein protein, Fats fats) {
        this.customer = customer;
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public Carbs getCarbs() {
        return carbs;
    }

    public Protein getProtein() {
        return protein;
    }

    public Fats getFats() {
        return fats;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-17s -> Carbs: %-10s Protein: %-8s Fats: %s",
                customer.getName(), "(" + customer.getDietPlan() + ")", carbs, protein, fats);
    }
}
