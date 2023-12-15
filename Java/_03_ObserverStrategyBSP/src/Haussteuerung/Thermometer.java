package Haussteuerung;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thermometer implements Devices{
    private int temperature;
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean isOn;

    public Thermometer() {
        this.isOn = false;
    }
    public void setTemperature() {
        Random random = new Random();
        this.temperature = random.nextInt(40);
        System.out.println("Thermometer: Current Temperature is: " + this.temperature + "°C");
        if(this.temperature > 20) {
            informAll();
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void informAll() {
        for (Observer observer : this.observers) {
            observer.inform(this.temperature);
        }
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }
}
