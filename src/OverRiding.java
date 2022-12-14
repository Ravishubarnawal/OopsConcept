public class OverRiding {
    public static void main(String[] args) {
    Game g1= new Football();
    g1.Criteria();

    }
}
class Game{
    public void Criteria(){
        System.out.println("Require at least two players to play it");
    }

}
class Football extends Game{
    public void Criteria(){
        super.Criteria();
        System.out.println("Require at least 10 players to play the game");
    }
    public void play(){
        System.out.println("Require two teams to play the game");
    }
}