import java.util.Scanner;
public class SuperKeywordWork {
    public static void main(String[] args) {
      Father f1= new Son();
      f1.FindAge();
      f1.show();
    }
}
class Father{
    void FindAge(){
        Scanner sc = new Scanner(System.in); // for user input dob;
        System.out.println("Enter dob");
        int dob= sc.nextInt();
        int age= 2022-dob;
        System.out.println("Age is:"+age);
    }
    void show(){
        System.out.println("This is superclass working using super keyword");
    }
}
class Son extends Father{
    void show(){
        super.show();// same method as is parent and child class to execute parent class method use "super" keyword.
        System.out.println("This is use of son class");
        super.show();

    }
}