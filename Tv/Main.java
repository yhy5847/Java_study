import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Scanner in = new Scanner(System.in);
        int ch = in.nextInt();
        smartTv.changeCh(ch);
    }
}
