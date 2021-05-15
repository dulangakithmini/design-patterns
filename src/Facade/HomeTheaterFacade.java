package Facade;

public class HomeTheaterFacade {
    //    Use composition so that the facade has access to all the components of the subsystem
    DvdPlayer dvd;
    Screen screen;

    //    The facade is passed a reference to each component of the subsystem in its constructor. The facade then assigns each to the corresponding variable.
    public HomeTheaterFacade(DvdPlayer dvd, Screen screen) {
        this.dvd = dvd;
        this.screen = screen;
    }

    //    bring the components of the subsystem together into a unified interface
    public void WatchMovie(String movie) {
        screen.down();
        dvd.on();
    }

    public void endMovie() {
        screen.up();
        dvd.off();
    }
}
