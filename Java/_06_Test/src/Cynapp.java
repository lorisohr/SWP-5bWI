import java.util.ArrayList;
import java.util.List;

public class Cynapp {

    Beamer beamer = new Beamer();

    private List<Device> Devices = new ArrayList<Device>();

    public void addDevice(Device device) {
        Devices.add(device);
    }


    public void setActive(){

    }

    public void showDevice(int i){
        beamer.show(Devices.get(i).getContent());
    }
}
