import java.util.Scanner;
import pack02.Find;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("더해서 짝수가 되는 두 정수를 써주세요.");

        Find find = new Find(sc.nextInt(), sc.nextInt());

        find.answer();
        find.fst();

        System.out.println(find.st);

        System.out.println("곱해서 0미만이 되는 두 정수를 써주세요.");

        find.answer2();
        find.sec();

        System.out.println(find.st);
    }
}
