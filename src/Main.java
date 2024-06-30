import playground.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        long start = System.nanoTime();
//
//        // program start here..
//
//        Thread.sleep(3000);
//
//        // program end here..
//
//        long duration = (System.nanoTime() - start)/1000000;
//        System.out.println(duration + "ms");

        // new up an ArrayList instance called people to hold our Person objects
        ArrayList<Person> people = new ArrayList<>();

        // new up each person object and give it initial values
        Person person1 = new Person("Aaron", 39, "Mum", "Dad", "tech CEO");
        Person person2 = new Person("Bob", 40, "Bob", "Stacy", "Plumber");
        Person person3 = new Person("Mosh", 41, "Belinda", "Stu", "Teacher");
        Person person4 = new Person("steve", 51, "Mary", "Lyle", "construction worker");

        // add each person object to our ArrayList
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        // call the greet function for each person object in our ArrayList
        for (Person person:people) {
            person.greeting();
        }
    }
}