import Game.*;

class Index {
    public static void main(String[] args) {

        Status status = new Status();

        // 플레이어 스탯 부여
        Player player = new Player(status.hpStat(), status.powerStat());

        System.out.println("-----------------------------------------------");

        // 적 스탯 부여
        Enemy enemy = new Enemy(status.hpStat(), status.powerStat());


        //적과 조우
        Contact contact = new Contact();
        int actNum = contact.act();


        //선택창
        Fight fight = new Fight();
        
        while(true) {
            int fitNum = fight.start();
            enemy.hp -= player.power;
            player.hp -= enemy.power;
            System.out.println("Player");
            System.out.println("hp : " + player.hp);
            System.out.println("power : " + player.power);
            System.out.println("-----------------------------------------------");
            System.out.println("Enemy");
            System.out.println("hp : " + enemy.hp);
            System.out.println("power : " + enemy.power);

            if(enemy.hp <= 0 || player.hp <= 0){
                break;
            }
            if(actNum == 2 || fitNum == 2) {
                System.out.println("도망쳤다");
                break;
            }else if(actNum != 1 && fitNum !=1) {
                continue;
            }
            
            
            
        }
    }
}