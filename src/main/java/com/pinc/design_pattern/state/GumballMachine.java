package com.pinc.design_pattern.state;

public class GumballMachine {
    State soldState;

    State soldOutState;

    State noQuarterState;

    State hasQuarterState;

    State winnerState;


    State state = soldOutState;

    int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public GumballMachine(int number) {
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = number;
        if (count > 0) {
            this.state = noQuarterState;
        }
    }

    public  void insertQuarter() {
        state.insertQuarter();
    }

    public  void ejectQuarter() {
        state.ejectQuarter();
    }

    public  void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public  void releaseBalls() {

        System.out.println("a ball comes rolling out the slot ...");
        if (count != 0) {
            count = count - 1;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "soldState=" + soldState +
                ", soldOutState=" + soldOutState +
                ", noQuarterState=" + noQuarterState +
                ", hasQuarterState=" + hasQuarterState +
                ", winnerState=" + winnerState +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}
