package org.tapusd.chaptertwo.customobserver;

public class WeatherORamaMain {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new StatisticDisplay(weatherData);
        new HeadIndexDisplay(weatherData);

        weatherData.setMesurements(197, 80, 3);
        weatherData.setMesurements(33, 51, 3);
        weatherData.setMesurements(32, 70, 3);

    }
}
