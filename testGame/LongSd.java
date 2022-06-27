package testGame;

public class LongSd extends Weapon {
    
    LongSd() {
        this.name = "longSword";
        this.attRange = 2;
        this.changeTime = 2;
    }

    @Override
    public void change(){
        System.out.println(this.name + "(으)로 교체!");
        System.out.println("사거리는 " + this.attRange);
        System.out.println("교체시간은 " + this.changeTime);
    }

}
