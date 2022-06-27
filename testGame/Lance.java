package testGame;

public class Lance extends Weapon {
    
    Lance() {
        this.name = "lance";
        this.attRange = 3;
        this.changeTime = 2;
    }

    @Override
    public void change(){
        System.out.println(this.name + "(으)로 교체!");
        System.out.println("사거리는 " + this.attRange);
        System.out.println("교체시간은 " + this.changeTime);
    }

}
