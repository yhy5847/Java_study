package TestFile.expressway;

public class test {

    static enum city {서울, 경기, 충청};

    public static void enumCity() {
        String name;
        for(city c : city.values()) {
            if(c.name().equals("서울")) {
                name = "서울입니다.";
                System.out.println(name);
            }else if(c.name().equals("경기")) {
                name = "경기입니다.";
                System.out.println(name);
            }else if(c.name().equals("충청")) {
                name = "충청입니다.";
                System.out.println(name);
            }
        }
        name = "지역을 찾을 수 없습니다.";
        System.out.println(name);
    }

    public static void main(String[] args) {
        test.enumCity();
    }
}
