package org.tapusd.chaptertwo.customobserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temperature;
    private float humidity;
    private float pressure;
    List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void mesurementsChanged() {
        notifyObservers();
    }

    public void setMesurements(float temperature, float humidity, float pressure) {
       this.temperature = temperature;
       this.humidity = humidity;
       this.pressure = pressure;
       mesurementsChanged();
    }
}
