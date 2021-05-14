package Composite;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;
    boolean isVegetarian;

    public MenuItem(String name, String description, double price, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    //    operation method that both Menu and MenuItem will implement
    public void print() {
        System.out.println(name + " : " + price);
        if (isVegetarian) {
            System.out.println("Vegetarian");
        }
        System.out.println(description);
    }
}
