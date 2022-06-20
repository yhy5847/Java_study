import java.util.Scanner;

public class WeatherMan {
    public static void main(String[] args) {
        
        Cheonan ch = new Cheonan();

        
        System.out.println("지역을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        if(st.equals("천안")) {
            ch.weather();
            System.out.println("오늘 기온은 " + ch.cheonanC + "도 입니다");
            ch.whatSeason();
            System.out.println("계절은 " + ch.season + "입니다.");
        }
    }
}
