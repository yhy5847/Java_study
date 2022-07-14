package TestFile.expressway;

public interface Check {

    final Beginner beginner = new Beginner();
    final Expert expert = new Expert();

    static enum city { 천안, 서울};
    static enum highway {고속도로};

    static int getLimitSpeed(Driver inDriver) {
        if(inDriver instanceof Expert) {
            return inDriver.speed();
        }else if (inDriver instanceof Beginner) {
            return inDriver.speed();
        }
        return 0;
    }
}
