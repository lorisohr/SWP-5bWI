public class Main {
    public static void main(String[] args) {
        Cynapp cynapp = new Cynapp();
        Device airPlay1 = new AirPlay();
        Device miracast2 = new Miracast();
        Device airPlay2 = new AirPlay();
        Device miracast1 = new Miracast();


        cynapp.addDevice(airPlay1);
        cynapp.addDevice(miracast2);
        cynapp.addDevice(airPlay2);
        cynapp.addDevice(miracast1);

        cynapp.showDevice(0);
        cynapp.showDevice(2);
        cynapp.showDevice(1);
        cynapp.showDevice(3);
    }


}
