public class InheritanceWithOverRiding {
    public static void main(String[] args) {
        Animal a1= new Dog();
        a1.eat();// It can only use the fields and methods of superclass i.e.in subclass.
        // same method eat() but memory is made for Dog subclass method will be called i.e. @Override
        Dog d1= new Dog();
        d1.eat();
        d1.bark();
    }

}
class Animal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // overriding  eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}
