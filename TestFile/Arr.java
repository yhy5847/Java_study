package TestFile;

public class Arr {
    public static void main(String[] args) {
        int[] num = new int[3];
        for(int i = 0; i < num.length; ++i) {
            int j = 7;
            num[i] = j;
            ++j;
        }
        System.out.println(num);
    }
}
