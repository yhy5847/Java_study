package pack03;

import java.util.Scanner;
import java.util.ArrayList;

public class Ask {
    void ask5() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> askList = new ArrayList();
        
        for(int i = 0; i < 5; ++i) {
            System.out.println(i+1 + "번째 질문을 입력해주세요.");
            askList.add(input.nextLine());
        }
    }
}
