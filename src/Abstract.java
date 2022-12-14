public class Abstract {
    public static void main(String[] args) {

        //  car c1= new car() // we can't create memory object of abstract class for security reason and data hiding.
         Car caref= new bmw();
         caref.run();
         caref= new HyundaiCar();
         caref.run();


    }

}

    abstract class Car {
    abstract void run();
    }
    class bmw extends Car {
        @Override
        void run() {

            System.out.println("Car runs smoothly");
        }
        void price(){
            System.out.println("Expensive");
        }
    }

    class HyundaiCar extends Car {
        void run() {
            System.out.println("Hyundai Car runs smoothly and fast...");
        }
    }

