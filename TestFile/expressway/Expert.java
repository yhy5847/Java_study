package TestFile.expressway;

public class Expert implements Driver{


    @Override
    public int speed() {
        System.out.println("120으로 달립니다.");
        return 120;
    }
}
