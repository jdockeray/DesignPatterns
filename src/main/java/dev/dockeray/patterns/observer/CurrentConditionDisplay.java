package dev.dockeray.patterns.observer;

public class CurrentConditionDisplay implements DisplayElement, Observer{
    private float humidity;
    private float temperature;

    /**
     * keep reference to the subject. In future may want to unsubscribe.
     */
    private final WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData wd) {
        weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("humidity is " + humidity + " and temperature is " + temperature);
    }

    @Override
    public void update(float t, float h, float p) {
        humidity = h;
        temperature = t;
        display();
    }
}
