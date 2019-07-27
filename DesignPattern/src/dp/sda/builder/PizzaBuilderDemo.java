package dp.sda.builder;

public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza
                .PizzaBuilder("Cheese")
                .addSouce("Souce")
                .addCheese("Cheese")
                .build();

        pizza.pizzaDetails();
    }
}
