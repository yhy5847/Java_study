import java.util.Scanner;

class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        test test = new test();

        System.out.println("첫 번째 숫자를 입력하세요");

        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요");

        int num2 = sc.nextInt();

        int testNum = test.abc(num1, num2);

        System.out.println(num1 + " x " + num2 + " = " + testNum + "입니다" );
    }


    public int abc(int a, int b) {
        int j;
        j = a * b;
        return j;
    }
}