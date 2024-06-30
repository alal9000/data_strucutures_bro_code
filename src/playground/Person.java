package playground;

public class Person {
    private String name;
    private String job;
    private int age;
    private String[] parents;

    public Person(String name, int age, String parent1, String parent2, String job) {
        this.name = name;
        this.age = age;
        parents = new String[2];
        this.parents[0] = parent1;
        this.parents[1] = parent2;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greeting() {
        System.out.println("My name is " + name + ", I am " + age + " years old and work as a " + job);
    }
}
