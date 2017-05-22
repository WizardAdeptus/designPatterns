package ru.naykalab.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;


public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object obj) {
        if (obs instanceof WeatherData) {
            WeatherData wd = (WeatherData) obs;
            float currentTemp = wd.getTemperature();
            tempSum += currentTemp;
            numReadings++;

            if (currentTemp > maxTemp) {
                maxTemp = currentTemp;
            }

            if (currentTemp < minTemp) {
                minTemp = currentTemp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
