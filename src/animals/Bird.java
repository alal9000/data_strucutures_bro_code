package animals;
import interfaces.Animal;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Squark");
    }
}
