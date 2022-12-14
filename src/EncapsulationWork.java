public class EncapsulationWork {
    public static void main(String[] args) {
        Area rectangle = new Area(20,10);
        rectangle.getArea();


    }
}
  class Area{
    int length;
    int breath;
    Area(int length, int breath){
        this.length= length;
        this.breath= breath;
    }
    void getArea(){
        System.out.println("Area of Rectangle:" + length*breath);

    }
}
