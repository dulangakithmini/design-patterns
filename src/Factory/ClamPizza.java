package Factory;

public class ClamPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Add clams");
    }

    @Override
    void bake() {
        System.out.println("Bake Clam pizza");
    }

    @Override
    void cut() {
        System.out.println("Cut the Clam pizza");
    }

    @Override
    void box() {
        System.out.println("Box the Clam pizza");
    }
}
