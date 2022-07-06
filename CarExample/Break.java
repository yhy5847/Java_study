package CarExample;

public interface Break {
    default void stop() {
        System.out.println("차를 멈춥니다.");
    }
}
