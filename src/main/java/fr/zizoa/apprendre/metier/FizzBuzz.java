package fr.zizoa.apprendre.metier;

public class FizzBuzz {

    public static String printCorrespond(int i) {
        /*
          Cette version un peu compact peu ne pas être apprécié par certains, ça peut se
          car ça peut paraître un peu difficilement maintenable que si on restait sur des if .. else
         */
        var response = isDivisibleBy(i, 3) ? "Fizz" : "";
        response = isDivisibleBy(i, 5) ? response + "Buzz" : response;
        return response.equals("") ? String.valueOf(i) : response;
    }

    private static boolean isDivisibleBy(int numerateur, int denominateur) {
        return numerateur % denominateur == 0;
    }
}
