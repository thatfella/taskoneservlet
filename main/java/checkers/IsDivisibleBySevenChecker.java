package checkers;

/**
 * Created by ESALE on 30.10.2016.
 */
public class IsDivisibleBySevenChecker implements  NumChecker{

    public String check(int num) {
        String result;
        if (num % 7 == 0) {
            result="Divisible by 7";
            System.out.println(result);
        } else {
            result="NOT Divisible by 7";
            System.out.println(result);
        }
        return result;
    }
}
