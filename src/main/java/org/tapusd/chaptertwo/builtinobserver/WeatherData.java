package org.tapusd.chaptertwo.builtinobserver;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public void mesurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMesurements(float temperature, float humidity, float pressure) {
       this.temperature = temperature;
       this.humidity = humidity;
       this.pressure = pressure;
       mesurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
