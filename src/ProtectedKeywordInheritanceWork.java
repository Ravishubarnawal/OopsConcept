public class ProtectedKeywordInheritanceWork {
    public static void main(String[] args) {
        Mammals s1= new Sheep();
        s1.name="Shawn the sheep";
        s1.display();
        Sheep s2= new Sheep();
        s2.getInfo();


    }
}
class Mammals {
    protected String name; // accessiable in same package and subclass.

    protected void display() { // accessiable in same package and subclass.
        System.out.println("I am a mammal.");
    }
}

class Sheep extends Mammals {

    public void getInfo() {
        System.out.println("My name is " + name);
    }
    public  void display(){
        System.out.println("This is sheep mammal");
    }
}
