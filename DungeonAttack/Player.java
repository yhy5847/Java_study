public class Player {
    String name;
    int Hp;
    static Weapon[] weaponArr = new Weapon[4];
    weaponArr[0] = new Weapon(fist, 1, 1);
    weaponArr[1] = new Weapon(shortSword, 2, 1);
    weaponArr[2] = new Weapon(longSword, 2, 2);
    weaponArr[3] = new Weapon(lance, 2, 3);

    Player (String name, int Hp) {
        this.name = name;
        this.Hp = Hp;
    }
}
