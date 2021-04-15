package org.tapusd.chaptertwo.customobserver;

public class StatisticDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
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
        System.out.printf("Statistics: Max -> %sF Min -> %sF Avg -> %sF%n", temperature, temperature, temperature);
    }
}
