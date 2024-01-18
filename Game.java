public class Game {
    static int players_Turn = 0;
    static Entity Hero1 = new Entity("Gum", 150, 0, 20, 2);
    static Entity Hero2 = new Entity("Bombi", 100, 0, 40, 0);
    static Senjata senjata1 = new Senjata("AK-47", 20, 10);
    
    public static void main(String[] args) {
        Hero1.attack(Hero2);
        Hero2.defend();
        senjata1.tembak(Hero1, Hero2);
        Hero2.attack(Hero1);
        Hero1.is_Dead();
        Hero2.is_Dead();
    }
    
}