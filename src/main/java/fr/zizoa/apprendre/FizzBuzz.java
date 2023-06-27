package fr.zizoa.apprendre;

public class FizzBuzz {

    public static String printCorrespond(int i) {
        var response = "";
        if (isDivisibleBy(i, 3)) {
            response += "Fizz";
        }
        if (isDivisibleBy(i, 5)) {
            response += "Buzz";
        }
        return response.equals("") ? String.valueOf(i) : response;
    }

    private static boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
