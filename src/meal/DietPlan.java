package meal;

import meal.carbs.Carbs;
import meal.carbs.Pistachio;
import meal.proteins.Tofu;

public enum DietPlan {
    NO_RESTRICTION("No Restriction") {
        @Override
        public boolean allows(Food food) {
            return true;
        }
    },
    PALEO("Paleo") {
        @Override
        public boolean allows(Food food) {
            boolean carbAllowed = !(food instanceof Carbs) || food instanceof Pistachio;
            return carbAllowed && !(food instanceof Tofu) && !food.isDairy();
        }
    },
    VEGAN("Vegan") {
        @Override
        public boolean allows(Food food) {
            return !food.isMeat() && !food.isDairy();
        }
    },
    NUT_ALLERGY("Nut Allergy") {
        @Override
        public boolean allows(Food food) {
            return !food.isNut();
        }
    };

    private String displayName;

    DietPlan(String displayName) {
        this.displayName = displayName;
    }

    public abstract boolean allows(Food food);

    @Override
    public String toString() {
        return displayName;
    }
}
