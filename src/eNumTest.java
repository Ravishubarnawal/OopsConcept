public class eNumTest {
    public static void main(String[] args) {
        Climate b1 = Climate.Summer;
        System.out.println("Hello");
    }
}
enum  Climate{
    Winter,Summer,Spring;
    Climate(){
        System.out.println("Constructor for eNum");
    }

}