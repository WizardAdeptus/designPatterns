package ru.naykalab.patterns.observer;

import ru.naykalab.patterns.observer.java.CurrentConditionsDisplay;
import ru.naykalab.patterns.observer.java.ForecastDisplay;
import ru.naykalab.patterns.observer.java.StatisticsDisplay;
import ru.naykalab.patterns.observer.java.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        
        
        weatherData.setMesurements(30, 65, 30.4f);
        weatherData.setMesurements(47, 70, 43.2f);
        weatherData.setMesurements(98, 90, 11.2f);
    }
}