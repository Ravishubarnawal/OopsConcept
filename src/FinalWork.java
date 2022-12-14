public class FinalWork {
    public static void main(String[] args) {
        child c1= new child();
        c1.show();
        Parent p1= new child();
        c1.show();

    }
}
class Parent {
    private void show(){}
}
class child extends Parent{
    void print(){
        System.out.println("Child is inheritor of main");
    }
    void show(){
        System.out.println("This is re-defination of super class");
    }
}
