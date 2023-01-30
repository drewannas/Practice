public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    public void makeNoise() {
        System.out.println(name + " says Meow!");
    }
}
