package checkers;

/**
 * Created by ESALE on 08.11.2016.
 */
public class IsBoringChecker implements NumChecker {

    public String check(int num) {
        String result;
        if (num>1000000)
        {
            result="Is Boring";
        }
        else
        {
            result="Is NOT Boring";
        }
        return result;
    }
}
