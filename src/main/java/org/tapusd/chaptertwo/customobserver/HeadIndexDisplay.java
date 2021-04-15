package org.tapusd.chaptertwo.customobserver;

public class HeadIndexDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public HeadIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Heat index at %sF is: %s", temperature, getHeatIndex());
    }

    private double getHeatIndex() {
        double T = temperature;
        double R = humidity;
        double c1 = -42.379;
        double c2= -2.04901523;
        double c3 = -10.14333127;
        double c4 = -0.22475541;
        double c5 = -6.83783 * Math.pow(10,-3);
        double c6 = -5.481717 * Math.pow(10, -2);
        double c7 = -1.22874 * Math.pow(10,-3);
        double c8 = 8.5282 * Math.pow(10,-4);
        double c9 = -1.99 * Math.pow(10,-6);
        return c1+c2*T + c3*R + c4*T*R + c5*T + c6*R + c7*T*R + c8*T*R + c9*T*R;
    }
}
