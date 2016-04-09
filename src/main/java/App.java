public class App {
    public static void main(String[] args) {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.transform(i));
        }
    }
}
