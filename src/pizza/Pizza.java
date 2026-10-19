/**
 * PIZZA BUILDER
 */
package pizza;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<Topping> toppings;
    private Size size;

    private Pizza(Builder builder) {
        this.toppings = new ArrayList<>(builder.toppings);
        this.size = builder.size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public Size getSize() {
        return size;
    }

    public void eat() {
        String toppingList = toppings.isEmpty()
                ? "no toppings"
                : toppings.stream().map(Topping::toString).collect(Collectors.joining(", "));
        System.out.printf("Eating a %s pizza with %d topping(s): %s%n", size, toppings.size(), toppingList);
    }

    public static class Builder {
        private List<Topping> toppings = new ArrayList<>();
        private Size size;

        private Builder addTopping(Topping topping) {
            toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

        public Builder addPepperoni() {
            return addTopping(Topping.PEPPERONI);
        }

        public Builder addSausage() {
            return addTopping(Topping.SAUSAGE);
        }

        public Builder addMushrooms() {
            return addTopping(Topping.MUSHROOMS);
        }

        public Builder addBacon() {
            return addTopping(Topping.BACON);
        }

        public Builder addOnions() {
            return addTopping(Topping.ONIONS);
        }

        public Builder addExtraCheese() {
            return addTopping(Topping.EXTRA_CHEESE);
        }

        public Builder addPeppers() {
            return addTopping(Topping.PEPPERS);
        }

        public Builder addChicken() {
            return addTopping(Topping.CHICKEN);
        }

        public Builder addOlives() {
            return addTopping(Topping.OLIVES);
        }

        public Builder addSpinach() {
            return addTopping(Topping.SPINACH);
        }

        public Builder addTomatoAndBasil() {
            return addTopping(Topping.TOMATO_AND_BASIL);
        }

        public Builder addBeef() {
            return addTopping(Topping.BEEF);
        }

        public Builder addHam() {
            return addTopping(Topping.HAM);
        }

        public Builder addPesto() {
            return addTopping(Topping.PESTO);
        }

        public Builder addSpicyPork() {
            return addTopping(Topping.SPICY_PORK);
        }

        public Builder addHamAndPineapple() {
            return addTopping(Topping.HAM_AND_PINEAPPLE);
        }
    }
}