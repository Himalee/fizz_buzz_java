import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void convertNumber_1_returns1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(fizzBuzz.convertNumber(1), 1);
    }

    @Test
    public void convertNumber_2_returns2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(fizzBuzz.convertNumber(2), 2);
    }
}
