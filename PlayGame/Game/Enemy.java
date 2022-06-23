package Game;

public class Enemy {
    public int hp;
    public int power;

    public Enemy() {}

    
    public Enemy(int hp, int power) {
        this.hp = hp;
        this.power = power;
        System.out.println("Enemy");
        System.out.println("hp : " + hp);
        System.out.println("power : " + power);
    }
}