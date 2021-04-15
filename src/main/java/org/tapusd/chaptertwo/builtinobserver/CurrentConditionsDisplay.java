package org.tapusd.chaptertwo.builtinobserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: Temp ->%sF Humid -> %s Pressure -> %s%n", temperature, humidity, pressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
