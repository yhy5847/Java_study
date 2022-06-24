package RPG.Game;

public class Enemy {

    //적 변수 선언
    public String name;
    int lv;
    // int exp;
    public int hp;
    int maxhp;
    int cost;
    int maxcost;
    int force;
    int avoidance;
    int luck;

    //적 생성자 선언
    public Enemy (String name, int lv, int hp, int maxhp, int cost, int maxcost, int force, int avoidance, int luck) {
        this.name = name;
        this.lv = lv;
        // this.exp = exp;
        this.hp = hp;
        this.maxhp = maxhp;
        this.cost = cost;
        this.maxcost = maxcost;
        this.force = force;
        this.avoidance = avoidance;
        this.luck = luck;
    }

    //공격 메소드
    public void Attack(Character c) {
        int damage = force;
        damage = damage <= 0 ? 1 : damage;
        int critical = luck - c.avoidance;
        if(critical > 0) {
            if((int)(Math.random()) * 100 > 70) {
                damage *= critical;
            }
        } else if(critical < 0) {
            if((int)(Math.random()) * 100 > 70) {
                damage = 0;
            }
        }
        c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
        System.out.println(name + "이(가) 공격했다." + c.name + "가 " + damage + "의 데미지를 입었다!");
        System.out.println(c.name + "의 남은 Hp : " + c.hp);
    }


}
