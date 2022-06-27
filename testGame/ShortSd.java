package testGame;

public class ShortSd extends Weapon {
    
    ShortSd() {
        this.name = "shortSword";
        this.attRange = 1;
        this.changeTime = 1;
    }

    @Override
    public void change(){
        System.out.println(this.name + "(으)로 교체!");
        System.out.println("사거리는 " + this.attRange);
        System.out.println("교체시간은 " + this.changeTime);
    }
}
