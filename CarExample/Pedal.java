package CarExample;

public interface Pedal {
    public default void go() {
        System.out.println("출발합니다.");
    }
}
