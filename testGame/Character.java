package testGame;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fist fist = new Fist();
        ShortSd shortSword = new ShortSd();
        LongSd longSword = new LongSd();
        Lance lance = new Lance();

        while(true){
            System.out.println("교체하실 무기를 선택해주세요");
            System.out.println("1. " + fist.name + "\n" + "2. " + shortSword.name + "\n" 
                                + "3. " + longSword.name + "\n" + "4. " + lance.name);

            int changeNum = in.nextInt();

            if(changeNum == 1) {
                fist.change(); 
            }else if (changeNum == 2) {
                shortSword.change();
            }else if (changeNum == 3) {
                longSword.change();
            }else if (changeNum == 4) {
                lance.change();
            }else {
                in.close();
                break;
            }
        }
    }
}
