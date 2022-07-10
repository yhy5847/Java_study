package TestFile.coffee;

public class main {
    public static void main(String[] args) {
        Coffee cafeLatte = new CafeLatte();
        CafeMocha cafeMocha = new CafeMocha();

        Coffee a = (CafeMocha)cafeMocha;

        cafeLatte.espresso();
        cafeLatte.milk();
        cafeLatte.syrup();


        a.espresso();
        cafeMocha.milk();
        cafeMocha.syrup();

    }
}
