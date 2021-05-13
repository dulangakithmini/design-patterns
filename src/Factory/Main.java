package Factory;

public class Main {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("Cheese");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("Cheese");
    }
}
