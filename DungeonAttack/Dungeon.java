public class Dungeon {
    public static void main(String[] args) {


        System.out.println("던전으로 들어갔다.");
        System.out.println("적과 조우!");
        for(int i = 1; true; ++i) {
            String str = String.valueOf(i);
            Enemy slime = new Enemy("slime"+"str", 10, 1);

        }
    }
}
