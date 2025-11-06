package BuilderPattern.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setSize(25)
                .setCheese(true)
                .setPepperoni(true)
                .setBacon(true)
                .build();

        System.out.println(pizza);
    }
}
