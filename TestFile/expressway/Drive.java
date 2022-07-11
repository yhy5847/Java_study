package TestFile.expressway;

public class Drive {

    void test (Driver a, Driver b, Driver c) {
        System.out.println(a.getClass().getName().equals("TestFile.expressway.Beginner"));
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass());
        System.out.println(a.getClass().isInstance(b));
        System.out.println(b instanceof Expert);
    }
}
