package dev.dockeray.patterns.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
