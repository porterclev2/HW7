/**
 * PIZZA DRIVER
 * Pizza Hut: any combination of toppings, small medium or large
 * 
 * Pizza hut: large pizza, 3 tops; small pizza, 2 tops
 * Little Caesars: med pizza 8 tops; small pizza 6 tops
 * Dominos: small pizza 1 top; large pizza 3 tops
 */
package pizza;

public class PizzaDriver {
    public static void main(String[] args) {
        System.out.println("\nPizza Hut");
        Pizza smallPizzaHut = new Pizza.Builder(PizzaChain.PIZZA_HUT, Size.SMALL)
                .addPepperoni()
                .addMushrooms()
                .addOlives()
                .build();
        Pizza mediumPizzaHut = new Pizza.Builder(PizzaChain.PIZZA_HUT, Size.MEDIUM)
                .addSausage()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addPeppers()
                .addSpinach()
                .build();
        Pizza largePizzaHut = new Pizza.Builder(PizzaChain.PIZZA_HUT, Size.LARGE)
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addChicken()
                .addTomatoAndBasil()
                .addBeef()
                .addHam()
                .addPesto()
                .addSpicyPork()
                .build();

        smallPizzaHut.eat();
        mediumPizzaHut.eat();
        largePizzaHut.eat();

        System.out.println("\nPizza Hut, Little Caesars and Dominos");

        Pizza pizzaHutSmall = new Pizza.Builder(PizzaChain.PIZZA_HUT, Size.SMALL)
                .addPepperoni()
                .addSausage()
                .build();
        Pizza pizzaHutLarge = new Pizza.Builder(PizzaChain.PIZZA_HUT, Size.LARGE)
                .addSausage()
                .addBacon()
                .addHam()
                .build();

        Pizza littleCaesarsSmall = new Pizza.Builder(PizzaChain.LITTLE_CAESARS, Size.SMALL)
                .addSpicyPork()
                .addTomatoAndBasil()
                .addExtraCheese()
                .addChicken()
                .addPeppers()
                .addPesto()
                .build();
        Pizza littleCaesarsMedium = new Pizza.Builder(PizzaChain.LITTLE_CAESARS, Size.MEDIUM)
                .addPepperoni()
                .addPeppers()
                .addSpicyPork()
                .addSausage()
                .addOnions()
                .addOlives()
                .addBacon()
                .addBeef()
                .build();

        Pizza dominosSmall = new Pizza.Builder(PizzaChain.DOMINOS, Size.SMALL)
                .addPepperoni()
                .build();
        Pizza dominosLarge = new Pizza.Builder(PizzaChain.DOMINOS, Size.LARGE)
                .addExtraCheese()
                .addOnions()
                .addHam()
                .build();

        pizzaHutSmall.eat();
        pizzaHutLarge.eat();
        littleCaesarsSmall.eat();
        littleCaesarsMedium.eat();
        dominosSmall.eat();
        dominosLarge.eat();
    }
}
