package Haussteuerung;

public class AwningController implements Observer {
    @Override
    public void inform(int temperature) {
        System.out.println("AwningController: I am informed. Current Temperature is: " + temperature + "°C");
    }
}
