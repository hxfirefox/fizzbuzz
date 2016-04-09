import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzRuleTest {
    private FizzRule rule;

    @Before
    public void setUp() throws Exception {
        rule = new FizzRule();
    }

    @Test
    public void should_out_fizz_when_number_is_multiples_of_three() throws Exception {
        // given

        // when
        final String result = rule.transform(3);
        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_out_nothing_when_number_is_not_multiples_of_three() throws Exception {
        // given

        // when
        final String result = rule.transform(4);
        // then
        assertThat(result, is(""));
    }
}
