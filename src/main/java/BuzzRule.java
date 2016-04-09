public class BuzzRule implements Rule {
    @Override
    public String transform(int number) {
        return number % 5 == 0 ? "Buzz" : "";
    }
}
