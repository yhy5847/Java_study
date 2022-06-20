//입력받을 질문을 저장하고 출력하는 파일
package Queation;

import java.util.Scanner;
import java.util.ArrayList;


public class Ask {
    public void SaveAsk() {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> AskList = new ArrayList<>();

        for(int i = 0; i < 20; ++i) {
            System.out.println(i+1 + "번째 질문");
            AskList.add(input.nextLine());
        }

        System.out.println(AskList);
        input.close();
    }
}
