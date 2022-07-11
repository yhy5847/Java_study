package TestFile;

public class Sig {


    String test = "ok";

    private static Sig ins = new Sig();

    private Sig() {};

    public static Sig getInstance() {
        return ins;
    }


}
