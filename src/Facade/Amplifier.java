package Facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setSurroundingSound() {
        System.out.println("Surrounding sound is set");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is set to " + volume);
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}
