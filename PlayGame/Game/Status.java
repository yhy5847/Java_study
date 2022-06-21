package Game;

public class Status {
    public int hpStat() {
        return (int) (Math.random()*21)+10;
    }

    public int powerStat() {
        return (int) (Math.random()*12)+1;
    }
}
