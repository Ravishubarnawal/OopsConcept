public class HouseWork {
    public static void main(String[] args) {
       House h1= new House();//object physical entity
       h1.color="Red";
       h1.price =20000000;
       House h2= new House();
       h2.color="Orange";
       h2.price =100000000;
       h1.PrintInfo();
       h2.PrintInfo();
       h1.display();


    }
}
class House{    //logical representation
    //Properties
    String color;
    double price;
    //Functions
    void PrintInfo(){
        System.out.println("Color of House is:"+this.color); // this keyword refer to refered object.
        System.out.println("Price of House is:"+this.price);
        System.out.println("\n");

    }
    void display(){
        PrintInfo();
    }
}