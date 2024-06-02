package dev.dockeray.patterns.observer;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(2, 4, 6);
    }
}
