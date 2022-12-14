public class BasicEnacapsulationWork {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setId(1);//p1.id=1;
        p1.setBrand("cello");//p1.brand="cello";

        Pen p2= new Pen();
        p2.setId(2);
        p2.setBrand("Agni");

        Pen p3= new Pen();
        p3.setId(3);
        p3.setBrand("Pilot");
        Pen [] pens ={ p1,p2,p3}; //Arrays
        for (Pen p:pens) { // for each loop to print all at once.
            p.getId();
            System.out.println("Id is :" +p.getId());
            System.out.println("Brand is :" +p.getBrand());

        }



    }
}
class Pen {  // for encapsulation properties should be private.
    private int id;
    private String brand;

    // creating getter and setter to run encapsulation.


    public int getId() {
        return id;
    }

    public void setId(int id) { // set have local variable
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {  // set  have local variable
        this.brand = brand;
    }
}
