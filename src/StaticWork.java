public class StaticWork {
    public static void main(String[] args) { // main method without static won't run.//public void main(String[] args)
        Bottle.AreaofOuter(); // No need to create object it refer to class rather than object due to static keyword.
        Bottle b1= new Bottle(); // without static we need to create object at main class.
        b1.AreaofCover();

    }

}
class Bottle{
    double radius=5.14;
    static  int length=10;  // it should be declare to be used in static method
    static int breath=20;
    static void AreaofOuter(){  //static methods require static data fields.
        System.out.println("Area of bottle:"+length*breath);
    }
    void AreaofCover(){
        System.out.println("Area of Cover:" +(3.14*(radius*radius)));


    }


}