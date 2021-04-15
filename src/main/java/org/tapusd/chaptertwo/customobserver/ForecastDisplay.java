package org.tapusd.chaptertwo.customobserver;

public class ForecastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
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
        String message = "Sky looks clear!";
        if (humidity > 50) {
            message = "There is a possibility of rain!";
        } if (humidity > 60) {
            message = "You will need an umbrella!";
        }
        System.out.println("Forecast: " + message);
    }
}
