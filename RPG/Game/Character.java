package RPG.Game;

import java.util.Scanner;

public class Character {

    Scanner sc = new Scanner(System.in);

    //캐릭터 변수 선언
    String name;
    int lv;
    int exp;
    int hp;
    int maxhp;
    int cost;
    int maxcost;
    int force;
    int avoidance;
    int luck;

    //캐릭터 생성자 선언
    Character(String name, int lv, int exp, int hp, int maxhp, int cost, int maxcost, int force, int avoidance, int luck) {
        this.name = name;
        this.lv = lv;
        this.exp = exp;
        this.hp = hp;
        this.maxhp = maxhp;
        this.cost = cost;
        this.maxcost = maxcost;
        this.force = force;
        this.avoidance = avoidance;
        this.luck = luck;
    }

    //스테이터스 창
    void StatusWindow() {
        System.out.println("===========================================");
        System.out.println("------------------Status-------------------");
        System.out.println("name : " + name);
        System.out.println("LV : " + lv);
        System.out.println("EXP : " + exp);
        System.out.println("Hp : " + hp);
        System.out.println("Cost" + cost);
        System.out.println("foc : " + force);
        System.out.println("avd : " + avoidance);
        System.out.println("luc : " + luck);
        System.out.println("===========================================");
    }

    //공격 메소드
    void Attack(Enemy e) {
        int damage = force;
        damage = damage <= 0 ? 1 : damage;
        int critical = luck - e.avoidance;
        if(critical > 0) {
            if((int)(Math.random()) * 100 > 70) {
                damage *= critical;
            }
        } else if(critical < 0) {
            if((int)(Math.random()) * 100 > 70) {
                damage = 0;
            }
        }
        e.hp = e.hp < damage ? e.hp - e.hp : e.hp - damage;
        System.out.println(name + "이(가) 공격했다." + e.name + "가 " + damage + "의 데미지를 입었다!");
        System.out.println(e.name + "의 남은 Hp : " + e.hp);
    }

    //경험치 획득 메소드
    void getExp(int exp) {
        System.out.println(exp + "의 경험치를 얻었다!");
        this.exp += exp;
        while(100 <= this.exp) {
            levelUp();
            this.exp -= 100;
        }
    }

    //레벨업 스탯증가 메소드
    void levelUp() {
        lv++;
        maxhp += 10;
        maxcost += 1;
        hp = maxhp;
        cost = maxcost;
        System.out.print("레벨업!");
        System.out.print("스탯 포인트 3획득!");
        System.out.print("force에 투자할 포인트");
        int forPoint = sc.nextInt();
        force += forPoint;
        System.out.print("avoidance에 투자할 포인트");
        int avdPoint = sc.nextInt();
        avoidance += avdPoint;
        System.out.print("force에 투자할 포인트");
        int lucPoint = sc.nextInt();
        luck += lucPoint;
        
    }
}
