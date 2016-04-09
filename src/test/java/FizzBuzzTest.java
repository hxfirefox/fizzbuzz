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

    @Test
    public void should_out_fizz_when_input_3() throws Exception {
        // given

        // when
        final String result = fizzbuzz.transform(3);
        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_out_buzz_when_input_5() throws Exception {
        // given

        // when
        final String result = fizzbuzz.transform(5);
        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_out_fizzbuzz_when_input_15() throws Exception {
        // given

        // when
        final String result = fizzbuzz.transform(15);
        // then
        assertThat(result, is("FizzBuzz"));
    }
}
