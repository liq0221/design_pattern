package com.pinc.design_pattern.facade;

public class Main {

    public static void main(String[] args) {
        HomeWatchTVFacade homeWatchTVFacade = new HomeWatchTVFacade(new DvdPlayer(),new CdPlayer(),new Screen());
        homeWatchTVFacade.startWatchDvd();
        System.out.println("watch two hours...");
        homeWatchTVFacade.endWatchDvd();
        System.out.println("end watch...");

    }
}
