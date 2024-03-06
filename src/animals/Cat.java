package animals;
import interfaces.Animal;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
