public class Main {
    public static void main(String[] args) {
        Beamer beamer = new Beamer();
        Device airPlay1 = new AirPlay();
        Device miracast2 = new Miracast();
        Device airPlay2 = new AirPlay();
        Device miracast1 = new Miracast();
        beamer.show(airPlay1.getContent());
        beamer.show(miracast2.getContent());

        Cynapp.addDevice(airPlay1);
        Cynapp.addDevice(miracast2);
        Cynapp.addDevice(airPlay2);
        Cynapp.addDevice(miracast1);

        Cynapp.showDevice(0);
        Cynapp.showDevice(2);
        Cynapp.showDevice(1);
        Cynapp.showDevice(3);
    }


}
