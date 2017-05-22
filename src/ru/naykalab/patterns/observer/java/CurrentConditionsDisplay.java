package ru.naykalab.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData wd = (WeatherData) obs;
            temperature = wd.getTemperature();
            humidity = wd.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(
            "Current conditions: " + 
            temperature + "F degrees and " + 
            humidity + "% humidity"
        );
    }

}
