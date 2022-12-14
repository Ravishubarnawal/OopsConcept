public class Interface {
    public static void main(String[] args) {
        ProgrammingLanguage p1= new ProgrammingLanguage();
        p1.getName("Vishal Samant");
    }
}
interface Language{
        void getName(String name);
}
class ProgrammingLanguage implements Language{
    @Override
    public void getName(String name) {
        System.out.println("Programming Language name:" +name);
    }
}