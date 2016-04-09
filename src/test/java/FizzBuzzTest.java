import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() throws Exception {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void should_out_1_when_input_1() throws Exception {
        // given

        // when
        final String result = fizzbuzz.transform(1);
        // then
        assertThat(result, is("1"));
    }
}
