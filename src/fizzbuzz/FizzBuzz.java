package fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("""
                           Welcome to FizzBuzz
                           Let's go""");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz\n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz\n");
            } else {
                System.out.print(i + "\n");
            }
        }
    }

}
