//public class RemoteWork {
//    public static void main(String[] args) {
//        Television t1= new Television();
//        t1.channel(3);
//
//
//
//    }
//}
//interface MyRemote{
//    void on();
//    void off();
//
//}
//class Television implements MyRemote{
//
//    @Override
//    public void on() {
//        System.out.println("Both TV's are ON");
//    }
//
//    @Override
//    public void off() {
//        System.out.println("Both TV's are OFF");
//    }
//    private int serviceprovider;
//
//    public int getServiceprovider() {
//        return serviceprovider;
//    }
//
//    public void setServiceprovider(int serviceprovider) {
//        this.serviceprovider = serviceprovider;
//    }
//    public void channel(int serviceprovider){
//        if(serviceprovider==2){
//            System.out.println("Its vianet");
//        } else if (serviceprovider==3) {
//            System.out.println("It's Worldlink");
//        }
//        else {
//            System.out.println("Invalid Input");
//        }
//    }
//}
