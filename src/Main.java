import animals.Bird;
import animals.Snake;
import animals.Cat;
import animals.Dog;
import interfaces.Animal;

public class Main {
    public static void main(String[] args) {
//        Queue<String> queue = new Queue<String>();
//
//        queue.offer("Karen");
//        queue.offer("Chad");
//        queue.offer("Steve");
//        queue.offer("Harold");
//
////        System.out.println(queue.isEmpty());
////        System.out.println(queue.size());
////        System.out.println(queue.contains("Harold"));
////        System.out.println(queue.peek());
//
//        queue.poll();
//        queue.poll();
//        queue.poll();
//        queue.poll();
//        queue.peek();

        // Creating an instance of the animals.Dog class
        Animal animal = new Bird();
        // Using the method defined in the interface
        animal.makeSound();

    }
}