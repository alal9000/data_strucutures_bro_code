package animals;
import interfaces.Animal;

public class Snake implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Hiss");
    }
}
