public interface Animal {
    void makeNoise();

    default void sleep() {
        System.out.println("Z z z");
    }
}
