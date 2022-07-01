class test {

   public static void main(String[] args) {
      test test = new test();

      test.aaa(10,10);
   }

   public void aaa(int x, int y) {
      String[][] arr = new String[x][y];

      for(int i = 0; i < x; i++ ) {
         for(int j = 0; j < y; j++) {
            arr[i][j] = "*";
         }
      }

      for(int i = 0; i < x; i++ ) {
         for(int j = 0; j < y; j++) {
            System.out.print(arr[i][j]);
         }
         System.out.println();
      }
      
   }
}