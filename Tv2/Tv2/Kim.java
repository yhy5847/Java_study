package Tv2;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.ArrayList;

public class Kim extends Remocon{
    public static void main(String[] args) {
        Kim kim = new Kim();
        kim.chLoad();
    }

    void chLoad() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> chList = new ArrayList<Integer>();

        while(true) {
            System.out.println("입력");
            System.out.println("입력을 멈추고 싶으시다면 0000 을 입력해주세요.");
            int input = sc.nextInt();
            if(input == 0000) {
                break;
            }else {
                chList.add(input);
            }
        }
        
        for(int i = 0; i < chList.size(); ++i){
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("2초 지연");
                System.out.println(chList.get(i));
            }catch(InterruptedException e) {
                break;
            }
        }
    }
}
