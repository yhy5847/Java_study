package VendingMachine;

public class Machine {
    int inputMoney;


    int outputMoney(Drink money, Drink price) {
        this.inputMoney = money;
        System.out.println(money+"원을 넣었습니다.");
        if(money - price >= 0) {
            int output = money - price;
            System.out.println(output + "원을 반환합니다.");
            return output;
        } else if(money - price < 0) {
            return System.out.println("잔액이 부족합니다.");
        }
    }
}