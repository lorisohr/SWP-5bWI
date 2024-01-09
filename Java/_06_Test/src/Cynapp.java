import java.util.ArrayList;
import java.util.List;

public class Cynapp {
    private List<Device> Devices = new ArrayList<Device>();

    public void addDevice(Device device) {
        Devices.add(device);
    }


    public void setActive(){

    }

    public void showDevice(int i){
        System.out.println(Devices.get(i).getContent());
    }
}
