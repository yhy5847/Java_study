package ExpresswayDrive;

import java.util.Scanner;

public class Driver {
    
    public void drive() {
        Scanner in = new Scanner(System.in);
        DrivingSkills ds = new DrivingSkills();

        System.out.println("어디를 주행하시겠습니까?");
        System.out.println("1. 초보자 전용도로  2. 숙련자 전용도로  3. 전문가 전용도로");
        int i = in.nextInt();


        if(i == 1) {
            Beginner beg = (Beginner)ds;
            beg.speedB();
        }else if(i == 2) {
            Proficient pro = (Proficient)ds;
            pro.speedP();
        }else if(i == 3) {
            Expert exp = (Expert)ds;
            exp.speedE();
        }
    }
}
