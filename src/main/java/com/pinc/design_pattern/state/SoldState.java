package com.pinc.design_pattern.state;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already give you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't give you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBalls();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }


}
