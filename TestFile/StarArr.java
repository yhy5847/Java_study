public class StarArr {

    public void Rhombus(int x) {
        double y = (x-1)/2;

        for(int i = 1; i <= x; ++i, --y) {
            for(int j = 0; j < Math.abs(y); ++j){
                System.out.print(" ");
            }
            for(int j = 0; j < x - (Math.abs(y)*2); ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
