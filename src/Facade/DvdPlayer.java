package Facade;

public class DvdPlayer {
    public void on() {
        System.out.println("On the DVD");
    }

    public void play(String movie) {
        System.out.println(movie + " plays");
    }

    public void stop() {
        System.out.println("Stop the DVD player");
    }

    public void eject() {
        System.out.println("DVD ejected");
    }

    public void off() {
        System.out.println("Off the DVD player");
    }
}
