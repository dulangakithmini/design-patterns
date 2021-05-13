package SimpleFactory;

public class SimplePizzaFactory {

    public Pizza cretePizza(String type) {
        Pizza pizza = null;

        if (type == "Cheese") {
            pizza = new CheesePizza();
        } else if (type == "Veggie") {
            pizza = new VeggiePizza();
        } else if (type == "Clam") {
            pizza = new ClamPizza();
        } else if (type == "Pepperoni") {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
