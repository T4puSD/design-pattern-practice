package org.tapusd.chaptersix;

public class Light {
    String lightLocation;
    private State state;

    public Light(String lightLocation) {
       this.lightLocation = lightLocation;
    }

    public void on() {
        this.state = State.ON;
        System.out.println(lightLocation + " " +"Turning light ON");
    }

    public void off() {
        this.state = State.OFF;
        System.out.println(lightLocation + " " +"Turning light OFF");
    }

    public State getState() {
        return state;
    }

    enum State {
        ON,
        OFF;
    }
}
