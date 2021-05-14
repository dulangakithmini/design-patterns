package Composite;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menucomponents = new ArrayList<>();
    String name;
    String descripttion;

    public Menu(String name, String descripttion) {
        this.name = name;
        this.descripttion = descripttion;
    }

    public void add(MenuComponent menuComponent) {
        menucomponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menucomponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menucomponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return descripttion;
    }

    //    operation method that both Menu and MenuItem will implement
    public void print() {
        System.out.println(name + " : " + descripttion);
    }
}
