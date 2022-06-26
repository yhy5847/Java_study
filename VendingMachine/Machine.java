package VendingMachine;

public class Machine {
    int inputMoney;
    int output;

    void outputMoney(int money, int price) {
        this.inputMoney = money;
        int output = money - price;
        this.output = output;

        if(output >= 0) {
            System.out.println(output + "원을 반환합니다.");
        } else if(output < 0) {
            System.out.println("잔액이 부족합니다.");
        }
    }
}