package Factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if (type == "Cheese") {
            return new NYStyleCheesePizza();
        } else if (type == "Veggie") {
            return new NYStyleVeggiePizza();
        } else if (type == "Clam") {
            return new NYStyleClamPizza();
        } else if (type == "Pepperoni") {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
