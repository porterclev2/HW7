package pizza;

public enum PizzaChain {
    PIZZA_HUT("Pizza Hut"),
    LITTLE_CAESARS("Little Caesars"),
    DOMINOS("Dominos");

    private String displayName;

    PizzaChain(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
