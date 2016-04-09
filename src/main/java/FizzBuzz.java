import com.google.common.collect.Lists;

import java.util.List;

public class FizzBuzz implements Rule {
    private static List<Rule> rules = Lists.newArrayList();

    static {
        rules.add(new FizzRule());
        rules.add(new BuzzRule());
    }

    @Override
    public String transform(int number) {
        String result = "";
        for (Rule rule : rules) {
            result += rule.transform(number);
        }
        return result.length() == 0 ? String.valueOf(number) : result;
    }
}
