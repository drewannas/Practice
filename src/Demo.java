import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner read = new Scanner(System.in);
        System.out.println("Cat or Dog? ");
        String animal = read.nextLine();
        while(!(animal.equalsIgnoreCase("dog") ||
                animal.equalsIgnoreCase("cat"))) {
                    System.out.println("You entered " + animal);
                    System.out.println("Enter cat or dog: ");
                    animal = read.nextLine();
                }
        System.out.println("What's its name?");
        String name = read.nextLine();
        Animal realMal = new Dog("placeholder");
        if(animal.equalsIgnoreCase("cat")) {
            realMal = new Cat(name);
        }
        else if(animal.equalsIgnoreCase("dog")) {
            realMal = new Dog(name);
        }   
        realMal.makeNoise();
        read.close();
    }
}



