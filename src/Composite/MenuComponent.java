package Composite;

public abstract class MenuComponent {

    //    Composite methods
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //    operation methods
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    //    operation method that both Menu and MenuItem will implement
    public void print() {
        throw new UnsupportedOperationException();
    }
}
