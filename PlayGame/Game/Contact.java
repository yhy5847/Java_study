package PlayGame.Game;

import java.util.Scanner;

public class Contact {
    Scanner input = new Scanner(System.in);
    public int act() {
        System.out.println("-----------------------------");
        System.out.println("- 1.싸운다       2.도망친다 -");
        System.out.println("-----------------------------");

        while(true) {
            int whatDo = input.nextInt();
            if(whatDo == 1) {
                System.out.println("전투시작");
                return 1;
            } else if (whatDo == 2) {
                System.out.println("도망쳤다");
                return 2;
            } else {
                continue;
            }
        }
    }
}
