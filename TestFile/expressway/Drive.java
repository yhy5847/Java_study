package TestFile.expressway;

public class Drive {

    private Driver driverType;

    public Drive() { driverType = new Beginner();}

    public void setDriver(Driver inDriver) {
        driverType = inDriver;
        System.out.println("드라이버가 교체 되었습니다 : " + driverType.getClass().getName());
    }

    public Driver getDriver() { return driverType;}


//    void test (Driver a, Driver b, Driver c) {
//        System.out.println(a.getClass().getName().equals("TestFile.expressway.Beginner"));
//        System.out.println(b.getClass().getName());
//        System.out.println(c.getClass());
//        System.out.println(a.getClass().isInstance(b));
//        System.out.println(b instanceof Expert);
//    }


}
