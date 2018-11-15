public class FizzBuzz {
    public String convertNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(number);

    }

}
