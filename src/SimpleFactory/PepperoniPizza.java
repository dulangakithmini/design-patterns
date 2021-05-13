package SimpleFactory;

public class PepperoniPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Add pepperoni");
    }

    @Override
    void bake() {
        System.out.println("Bake Pepperoni pizza");
    }

    @Override
    void cut() {
        System.out.println("Cut the Pepperoni pizza");
    }

    @Override
    void box() {
        System.out.println("Box the Pepperoni pizza");
    }
}
