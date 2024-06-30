import playground.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        // program start here..

        Thread.sleep(3000);

        // program end here..

        long duration = (System.nanoTime() - start)/1000000;
        System.out.println(duration + "ms");
    }
}