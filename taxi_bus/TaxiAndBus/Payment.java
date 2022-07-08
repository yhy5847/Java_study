package TaxiAndBus;

import java.util.Scanner;

public interface Payment {

    int inputMoney(int won);

//    default void pay(int age, int money) {
//        if(age >= 6 || age < 13){
//            if(money > 600) {
//                System.out.println("잔액이 부족합니다.");
//            }else {
//                System.out.println("어린이입니다.");
//            }
//
//        }else if (age >= 13 || age < 18) {
//            if(money > 900) {
//                System.out.println("잔액이 부족합니다.");
//            }else {
//                System.out.println("청소년입니다.");
//            }
//
//        }else if (age >= 18 || age < 65) {
//            if(money > 1500) {
//                System.out.println("잔액이 부족합니다.");
//            }else {
//                System.out.println("감사합니다.");
//            }
//
//        }else if (age >= 65) {
//            System.out.println("감사합니다.");
//        }
//    }
}
