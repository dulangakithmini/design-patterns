package SimpleFactory;

public class CheesePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Add cheese");
    }

    @Override
    void bake() {
        System.out.println("Bake Cheese pizza");
    }

    @Override
    void cut() {
        System.out.println("Cut the Cheese pizza");
    }

    @Override
    void box() {
        System.out.println("Box the Cheese pizza");
    }
}
