package Factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type == "Cheese") {
            return new ChicagoStyleCheesePizza();
        } else if (type == "Veggie") {
            return new ChicagoStyleVeggiePizza();
        } else if (type == "Clam") {
            return new ChicagoStyleClamPizza();
        } else if (type == "Pepperoni") {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
