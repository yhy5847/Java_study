package Game;

import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i = 1; true; ++i) {
            System.out.println("======================================");
            System.out.println(i + "턴!");
            System.out.println("턴 진행(x버튼 입력)");
            String input = in.nextLine();
            if(input != "x") {
                break;
            }
            System.out.println(enemy.name+ "을 공격!");
            System.out.println(damage + "의 데미지");
            System.out.println("");
            System.out.println("======================================");

            if(enemy.Hp <= 0) {
                System.out.println(enemy.name+ "을(를) 해치웠다!");
                System.out.println("던전을 나갔다.");
                break;
            }
        }
    }
}
