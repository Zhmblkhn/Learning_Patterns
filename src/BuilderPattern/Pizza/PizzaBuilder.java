package BuilderPattern.Pizza;

public class PizzaBuilder {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder setBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, cheese, pepperoni, bacon);
    }
}
