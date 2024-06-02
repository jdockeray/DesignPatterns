package dev.dockeray.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private final List<Observer> observers;
    private float humidity;
    private float pressure;
    private float temperature;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanges() {
        this.notifyObservers();
    }

    public void setMeasurements(float h, float p, float t) {
        humidity = h;
        pressure = p;
        temperature = t;

        measurementsChanges();
    }

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
}
