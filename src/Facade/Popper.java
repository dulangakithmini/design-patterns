package Facade;

public class Popper {
    public void on() {
        System.out.println("Popper is on");
        pop(10);
    }

    public void pop(int min) {
        System.out.println("Pops once every " + min + " minutes");
    }

    public void off() {
        System.out.println("Popper is off");
    }
}
