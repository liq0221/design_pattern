package com.pinc.design_pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {

    Observable observable;

    float temperature;

    float humidity;

    public CurrentConditionDisplay (Observable o) {
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    private void display() {
        System.out.println("温度为：" + temperature + "℃" + "湿度为：" + humidity + "%");
    }
}
