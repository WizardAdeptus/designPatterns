package ru.naykalab.patterns.observer.java;

import java.util.Observable;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }
    
    public void measurementChanged(){
        setChanged();
        // Объект данных не передается, значит используем модель запроса данных
        notifyObservers();
    }
    
    public void setMesurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
    
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
