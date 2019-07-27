package dp.sda.builder;

public class Pizza {

    private String name;
    private String cheese;
    private String souce;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.name = pizzaBuilder.name;
        this.cheese = pizzaBuilder.cheese;
        this.souce = pizzaBuilder.souce;
    }

    public void pizzaDetails() {
        System.out.println(name + " Pizza ready");
    }

    public static class PizzaBuilder {
        private String name;
        private String cheese;
        private String souce;

        public PizzaBuilder(String name) {
            this.name = name;
        }
        
        public PizzaBuilder addSouce(String souce) {
            this.souce = souce;
            return this;
        }

        public PizzaBuilder addCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
