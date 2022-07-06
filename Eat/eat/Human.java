public interface Human {
    default void eat() {
        System.out.println("아무것도 먹지 못했다.");
    }
}
