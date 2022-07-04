// import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.ArrayList;

public class Kim {
    public static void main(String[] args) {
        Kim kim = new Kim();
        kim.chLoad();
    }

    void chLoad() {       
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> chList = new ArrayList<Integer>();

        while(true) {
            if(in.nextInt() == 0000) {
                break;
            }else {
                System.out.println("입력");
                chList.add(in.nextInt());
            }
        }
        
        for(int i = 0; i < chList.size(); ++i){
            System.out.print(chList.get(i) + ", ");
        }
        // TimeUnit.SECONDS.sleep(2);
    }
    

}
