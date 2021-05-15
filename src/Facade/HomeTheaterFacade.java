package Facade;

public class HomeTheaterFacade {
    //    Use composition so that the facade has access to all the components of the subsystem
    PopcornPopper popcornPopper;
    DvdPlayer dvd;
    Screen screen;
    Amplifier amplifier;
    Projector projector;
    TheaterLights theaterLights;

    //    The facade is passed a reference to each component of the subsystem in its constructor. The facade then assigns each to the corresponding variable.
    public HomeTheaterFacade(PopcornPopper popcornPopper, DvdPlayer dvd, Screen screen, Amplifier amplifier, Projector projector, TheaterLights theaterLights) {
        this.popcornPopper = popcornPopper;
        this.dvd = dvd;
        this.screen = screen;
        this.amplifier = amplifier;
        this.projector = projector;
        this.theaterLights = theaterLights;
    }

    //    bring the components of the subsystem together into a unified interface
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");

        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim();
        screen.down();
        projector.wideScreenKMode();
        amplifier.on();
        amplifier.setSurroundingSound();
        amplifier.setVolume(20);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down");

        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
