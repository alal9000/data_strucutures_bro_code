public class Main {
    public static void main(String[] args) {


        System.out.println(addUpLinear(1_000_000));

        System.out.println(addUpConstant(1_000_000));

    }

    static long addUpLinear(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static long addUpConstant(long n) {
        long sum = n * (n + 1) / 2;
        return sum;
    }
}