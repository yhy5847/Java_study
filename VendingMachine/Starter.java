package VendingMachine;

import java.util.Scanner;

public class Starter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drink coke = new Cola("coke", 1000, "sweet", true);
        Machine machine = new Machine();

        System.out.println("금액을 투입하여 주십시오.");
        int money = sc.nextInt();
        machine.outputMoney(money, coke.price);
    }
}
