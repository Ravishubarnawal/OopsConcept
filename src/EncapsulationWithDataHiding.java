import java.awt.*;

public class EncapsulationWithDataHiding {
    public static void main(String[] args) {
        AreaofRectangle a1= new AreaofRectangle();
        a1.setLength(20);
        a1.setBreath(10);
        a1.Area();

    }
}
class AreaofRectangle{   // No need to create subclass to access the data we can just use getter and setter.
   private int length;
   private int breath;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }
    public void Area(){
       int  Rectangle= length*breath;
        System.out.println(Rectangle);
    }
}