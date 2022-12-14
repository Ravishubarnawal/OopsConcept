public class Constructor {
    public static void main(String[] args) {
        Mobile m1= new Mobile("MotorollaG52",32000,"Snapdragon 650");
        // need to specify the value while creating instance.
        Mobile m2= new Mobile("Pocom4-pro 5G", 33000,"MediaTek G95");
        Mobile [] mobiles = {m1,m2};
        for (Mobile n:mobiles) {
            n.displayValue();

        }

    }


}
class Mobile{
    String name;
    int price;
    String processor;
    Mobile(String name, int price,String processor){ // same name as class
        this.name= name;
        this.price=price;
        this.processor= processor;
    }
    public void displayValue(){
        System.out.println("Name is:"+this.name);
        System.out.println("Price is:"+this.price);
        System.out.println("Processor is:"+this.processor);
        System.out.println(".................................\n");
    }
}

