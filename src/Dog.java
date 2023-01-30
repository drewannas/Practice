public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    
    public void makeNoise() {
        System.out.println(name + " says Woof!");
    }
}
