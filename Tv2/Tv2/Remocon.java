package Tv2;

import java.util.Scanner;
import java.util.ArrayList;

public class Remocon {
    void inputCh() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> chArr = new ArrayList<Integer>();
        while(true) {
            int i = in.nextInt();
            chArr.add(i);
        }
    }
}
