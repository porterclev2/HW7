package meal;

public enum Macronutrient {
    CARBS("Carbs"),
    PROTEIN("Protein"),
    FATS("Fats");

    private String displayName;

    Macronutrient(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
