package Haussteuerung;

public class HeatController implements Observer{
    @Override
    public void inform(int temperature) {
        System.out.println("HeatController: I am informed. Current Temperature is: " + temperature + "°C");
    }
}
