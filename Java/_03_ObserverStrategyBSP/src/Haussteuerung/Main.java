package Haussteuerung;

public class Main {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        HeatController heatController = new HeatController();
        AwningController awningController = new AwningController();
        thermometer.addObserver(heatController);
        thermometer.addObserver(awningController);
        thermometer.setTemperature();
        thermometer.setTemperature();
    }
}
