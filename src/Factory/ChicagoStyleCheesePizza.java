package Factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded cheese");
    }

    void cut() {
        System.out.println("Cut into 4 slices");
    }
}
