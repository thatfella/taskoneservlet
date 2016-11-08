package checkers;

/**
 * Created by ESALE on 29.10.2016.
 */
public class IsMyFavChecker implements NumChecker {

    public String check(int num) {
        String result;
        if (num  == 21) {
            result="My Favourite";
            System.out.println(result);
        } else {
            result="NOT myfav";
            System.out.println(result);
        }
        return result;

    }



}

