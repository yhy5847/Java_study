public class SmartTv implements Searchable{
    
    @Override
    public void changeCh(int numberCh) {
        int avg1 = (chanel[1] - chanel[0])/2;
        int avg2 = (chanel[2] - chanel[1])/2;
        int avg3 = (chanel[3] - chanel[2])/2;

        if(numberCh < avg1) {
            System.out.println(chanel[0] + "번으로 변경합니다");
        }else if(numberCh >= avg1 && numberCh < avg2) {
            System.out.println(chanel[1] + "번으로 변경합니다");
        }else if(numberCh >= avg2 && numberCh < avg3) {
            System.out.println(chanel[2] + "번으로 변경합니다");
        }else if(numberCh >= avg3) {
            System.out.println(chanel[3] + "번으로 변경합니다");
        }
    }
}
