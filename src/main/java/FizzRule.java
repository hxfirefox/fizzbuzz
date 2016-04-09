public class FizzRule implements Rule {
    @Override
    public String transform(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }
}
