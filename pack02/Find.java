package pack02;
public class Find {
    public int num1;
    public int num2;
    public int num3;
    public String st;


    public Find(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }


    public void answer() {
        this.num3 = this.num1 + this.num2;
    }

    public void answer2() {
        this.num3 = this.num1 * this.num2;
    }
    

    public  void fst() {
        if(num3%2 == 0) {
            this.st = "정답입니다";
        } else {
            this.st = "오답입니다";
        }
    }
    
    public void sec() {
        if(num3 < 0) {
            this.st = "정답입니다";
        } else {
            this.st = "오답입니다";
        }
    }
}
