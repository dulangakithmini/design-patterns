package Facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new PopcornPopper(), new DvdPlayer(), new Screen(), new Amplifier(), new Projector(), new TheaterLights());

        homeTheaterFacade.watchMovie("Naruto");
        homeTheaterFacade.endMovie();
    }
}
