package org.tapusd.chaptersix;

public class Stereo {
    private String stereoLocation;
    private int volume;

    public Stereo(String stereoLocation) {
        this.stereoLocation = stereoLocation;
    }

    public void on() {
        System.out.println("Turning ON stereo");
    }

    public void off() {
        System.out.println("Turning OFF stereo");
    }

    public void setCD() {
        System.out.println("Setting CD in the CD drive");
    }

    public void setDVD() {
        System.out.println("Setting DVD in the DVD drive");
    }

    public void setRadio() {
        System.out.println("Setting Radio");
    }

    public void setVolume(int volume) {
        this.volume = Math.min(Math.max(0, volume), 100);
        System.out.println("Setting volume to: " + this.volume);
    }
}
