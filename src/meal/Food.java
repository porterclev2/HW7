package meal;

public abstract class Food {
    private String name;

    protected Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Macronutrient getMacronutrient();

    public boolean isDairy() {
        return false;
    }

    public boolean isMeat() {
        return false;
    }

    public boolean isNut() {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
