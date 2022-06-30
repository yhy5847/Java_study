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

// 지름 = d
// 반지름 = r
// 입력값 = x

// height : x
// width : x*2 -1

    void round(int x) {
        int y = x*2 -1;
        for(int i = 0; i < x; ++i) {
            for(int j = 0; j < y; ++j){
                
            }
        }
    }

}
