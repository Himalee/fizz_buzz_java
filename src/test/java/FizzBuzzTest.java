import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp () {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void convertNumber_1_returns1() {
        Assert.assertEquals("1", fizzBuzz.convertNumber(1));
    }

    @Test
    public void convertNumber_2_returns2() {
        Assert.assertEquals("2", fizzBuzz.convertNumber(2));
    }

    @Test
    public void convertNumber_3_returnsFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.convertNumber(3));
    }

    @Test
    public void convertNumber_5_returnsBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.convertNumber(5));
    }

    @Test
    public void convertNumber_6_returnsFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.convertNumber(6));
    }

    @Test
    public void convertNumber_10_returnsBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.convertNumber(10));
    }

}
