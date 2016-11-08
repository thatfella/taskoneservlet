package checkers;

public class IsEvenChecker implements NumChecker {

   public   String check(int num) {
       String result;
        if (num % 2 == 0) {
            result="even";
            System.out.println(result);
        } else {
            result="NOT even";
            System.out.println(result);
        }
        return result;

    }
}