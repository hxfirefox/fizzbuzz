import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BuzzRuleTest {
    private BuzzRule rule;

    @Before
    public void setUp() throws Exception {
        rule = new BuzzRule();
    }

    @Test
    public void should_out_buzz_when_number_is_multiples_of_five() throws Exception {
        // given

        // when
        final String result = rule.transform(5);
        // then
        assertThat(result, is("Buzz"));
    }
}
