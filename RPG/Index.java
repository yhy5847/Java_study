package RPG;

import RPG.Game.Character;
import RPG.Game.Enemy;
import java.util.Scanner;

public class Index {
    Character c;
    Scanner sc = new Scanner(System.in);
    Index() {
        c = new Character("양홍렬", 1, 0, 20, 20, 10, 10, 1, 1, 1);
    }

    public static void main(String[] args) {
        new Index().start();
    }

    void start() {
        int input = 0;

        while(true) {
            System.out.println("1. 스테이터스 \t2. 사냥 \t0. 종료");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    c.StatusWindow();
                    break;
                
                case 2:
                    hunt();
                    break;

                case 0:
                    System.out.println("종료되었습니다.");
                    System.exit(0);
                    break;
            }
        }
    }

    void hunt() {
        Enemy e = new Enemy("slime", 1, 50, 50, 5, 5, 1, 1, 1);
        System.out.println("적과 조우!");

        int input = 0;
        while(true){
            System.out.println("1. 공격 \t2. 도망");
            input = sc.nextInt();

            switch (input) {
                case 1 :
                c.Attack(e);
                if(e.hp <= 0) {
                    System.out.println(e.name + "을(를) 처치했다!");
                    c.getExp(150);
                    break;
                }
                e.Attack(c);
                break;
                
                case 2 :
                    System.out.println("도망쳤다...");
                    break;
            }
        }
    }
    // sc.close();
}
