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
    
    public void EX11() {
        int x = 30;
        int y = 60;

        String[][] ex11 = new String[x][y];

        for(int i = 0; i < ex11.length; ++i) {    
            for(int j = 0; j < ex11[x].length; ++j) {
               ex11[i][j] = "*";
            }
        }

        for(int i = 0; i < ex11.length; ++i) {
            for(int j = 0; j < ex11[x].length; ++j) {
               System.out.print(ex11[i][j]);
            }
            System.out.println();
        }
    }



// 지름 = d
// 반지름 = r
// 입력값 = x

// height : x
// width : x*2 -1

    // void round(int x) {
    //     int y = x*2 -1;
    //     for(int i = 0; i < x; ++i) {
    //         for(int j = 0; j < y; ++j){
                
    //         }
    //     }
    // }

}
