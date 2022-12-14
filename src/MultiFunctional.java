//import java.util.Scanner;
//
//class MultiFunctional{
//    public static void main(String[] args) {
//     Tv t1=new Tv();
//     t1.switchTv();
//    }
//}
//
//interface  Remote{
//   void on();
//   void off();
//   void switchTv();
//
//}
//class Tv implements Remote{
//
//    @Override
//    public void on() {
//        System.out.println("Both Tv's are ON");
//    }
//
//    @Override
//    public void off() {
//        System.out.println("Both Tv's are OFF");
//    }
//
//    @Override
//    public void switchTv() {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Select the channel id");
//        int id= sc.nextInt();
//        if(id==2) {
//            System.out.println("World link tv is On");
//        } else if (id==3) {
//            System.out.println("Vianet Tv is On");
//        }else {
//            System.out.println("Incorrect id input");
//        }
//
//    }
//}
//
//
//
