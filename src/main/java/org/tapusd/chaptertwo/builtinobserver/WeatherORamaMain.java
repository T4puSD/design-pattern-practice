package org.tapusd.chaptertwo.builtinobserver;

public class WeatherORamaMain {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new HeadIndexDisplay(weatherData);

        weatherData.setMesurements(197, 80, 3);
        weatherData.setMesurements(33, 51, 3);
        weatherData.setMesurements(32, 70, 3);

    }
}
