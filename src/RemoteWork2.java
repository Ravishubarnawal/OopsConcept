public class RemoteWork2 {
    public static void main(String[] args) {
    Remote t1= new NetTv();
    t1.powerOn();
    t1.powerOff();
    t1.SwitchToFavoriteTv(1);
    t1= new CGTv();
    t1.SwitchToFavoriteTv(1);

    }
}
interface Remote {
    void powerOn();

    void powerOff();

    void SwitchToFavoriteTv(int id);
}

class NetTv implements Remote{

    @Override
    public void powerOn() {
        System.out.println("Power on Net Tv");
    }
    @Override
    public void powerOff() {
        System.out.println("Power off Net Tv");
    }
    @Override
    public void SwitchToFavoriteTv(int id) {
        System.out.println("Net Tv is running on button:"+(id+2));
    }
}
class CGTv implements Remote{

    @Override
    public void powerOn() {
        System.out.println("Power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Power off");
    }

    @Override
    public void SwitchToFavoriteTv(int id) {
        System.out.println("CG Tv is running on button:"+(id+4));
    }
}


