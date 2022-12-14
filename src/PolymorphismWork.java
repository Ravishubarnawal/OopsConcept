public class PolymorphismWork {
    public static void main(String[] args) {
        Polygonshaped p1= new SquareShaped();
        p1.render();
        Polygonshaped p2= new Circle();
        p2.render();

    }
}
class Polygonshaped {

    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class SquareShaped extends Polygonshaped {

    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygonshaped {

    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}
