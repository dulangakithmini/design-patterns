package SimpleFactory;

public class VeggiePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Add vegitables");
    }

    @Override
    void bake() {
        System.out.println("Bake Veggie pizza");
    }

    @Override
    void cut() {
        System.out.println("Cut the Veggie pizza");
    }

    @Override
    void box() {
        System.out.println("Box the Veggie pizza");
    }
}
