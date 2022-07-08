package ExpresswayDrive;

public class DrivingSkills implements Beginner, Expert, Proficient{

    @Override
    public void speedB(){
        System.out.println("30키로로 달립니다.");
    }

    @Override
    public void speedP(){
        System.out.println("80키로로 달립니다.");
    }

    @Override
    public void speedE(){
        System.out.println("120키로로 달립니다.");
    }
}
