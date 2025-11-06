package BuilderPattern.Pizza;

public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }

    @Override
    public String toString() {
        return size + "\n" + cheese + "\n" + pepperoni + "\n" + bacon;
    }
}
