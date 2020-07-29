package com.pinc.design_pattern.facade;

public class HomeWatchTVFacade {

    DvdPlayer dvd;

    CdPlayer cd;

    Screen screen;

    public HomeWatchTVFacade(DvdPlayer dvd, CdPlayer cd, Screen screen) {
        this.dvd = dvd;
        this.cd = cd;
        this.screen = screen;
    }

    public void startWatchDvd() {
        screen.down();
        cd.on();
        dvd.on();
    }

    public void endWatchDvd() {
        dvd.off();
        cd.off();
        screen.up();
    }
}
