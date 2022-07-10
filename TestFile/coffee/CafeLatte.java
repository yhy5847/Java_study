package TestFile.coffee;

public class CafeLatte implements Coffee{

    @Override
    public void espresso() {
        System.out.println("에스프레소를 넣습니다");
    }


    @Override
    public void milk() {
        System.out.println("우유를 넣습니다");
    }

    @Override
    public void syrup() {
        System.out.println("시럽을 넣습니다");
    }



}
