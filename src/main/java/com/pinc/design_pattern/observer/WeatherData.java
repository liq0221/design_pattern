package com.pinc.design_pattern.observer;

import java.util.Observable;

public class WeatherData extends Observable {

    float temperature;

    float humidity;

    float pressure;

    public WeatherData() {}

    public void setMeasurements(float temperature, float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }

    public void measurementChange() {
        setChanged();
        notifyObservers();
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
