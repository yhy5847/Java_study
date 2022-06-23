package Game;

public class Player {
    public int hp;
    public int power;

    
    public Player() {
        
    }


    public Player(int hp, int power) {
        this.hp = hp;
        this.power = power;
        System.out.println("Player");
        System.out.println("hp : " + hp);
        System.out.println("power : " + power);
    }
}
