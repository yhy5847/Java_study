import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Driver.name();
    }

    static void name() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> driverList = new ArrayList<String>();

        while(true) {
            for(String driverName : driverList) {
                System.out.print(driverName + " ");
            }

            if(driverList.size() >= 5) {
                break;
            }else {
                System.out.println();
                System.out.println("운전자 이름을 입력해주세요.");
                driverList.add(in.nextLine());
            }
        }


//        System.out.println();
//        String firstName = driverList.get(0);
//        String secName = driverList.get(1);
//        System.out.println("0번째 :" + firstName + " 1번째 :" + secName);
//        System.out.println(firstName + "은 달릴 수 없습니다");
    }
}
