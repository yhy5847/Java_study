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
        System.out.println("원하시는 음료를 선택해주세요");
        System.out.println("1. " + coke.name + " 가격 : " coke.price)
        System.out.println("2. " + sprite.name + " 가격 : " sprite.price)
        int drinkNum = sc.nextInt();
        if(drinkNum == 1) {
            machine.outputMoney(money, coke.price);
        } else if(drinkNum == 2) {
            machine.outputMoney(money, sprite.price);
        }
    }
}
