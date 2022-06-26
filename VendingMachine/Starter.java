package VendingMachine;

import java.util.Scanner;

public class Starter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Drink coke = new Cola("coke", 1000, "sweet", true);
        Drink sprite = new Sprite("sprite", 900, "sweet", true);

        Machine machine = new Machine();

        System.out.println("금액을 투입하여 주십시오.");
        int money = sc.nextInt();

        do {System.out.println("===============================================");
            System.out.println("원하시는 음료를 선택해주세요");
            System.out.println("1. " + coke.name + " 가격 : " + coke.price);
            System.out.println("2. " + sprite.name + " 가격 : " + sprite.price);
            System.out.println("===============================================");

            int drinkNum = sc.nextInt();            
            if(drinkNum == 1) {
                System.out.println(coke.name+ "구입");

                machine.outputMoney(money, coke.price);

                if(machine.output < 0) {
                    break;
                }

                System.out.println("이용해주셔서 감사합니다.");
                break;
            }else if(drinkNum == 2) {
                System.out.println(sprite.name+ "구입");

                machine.outputMoney(money, sprite.price);

                if(machine.output < 0) {
                    break;
                }

                System.out.println("이용해주셔서 감사합니다.");

                break;
            }else {
                System.out.println("다시 입력해주세요");
            }
        }while(true);
    }
}
